package TryWebsite1.website.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TryWebsite1.website.model.UserVO;

@Controller
@RequestMapping(value="/account")
public class AccountController {

	@RequestMapping(value="/view")
	public ModelAndView viewAccount( 
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException{
		
		UserVO user = (UserVO)request.getSession().getAttribute("userdata");
		
		ModelAndView model = new ModelAndView();
		model.addObject("username", user.getUsername());
		model.addObject("sessionKey", request.getSession().getId());
		model.setViewName("account");
		return model;
	}
	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	public ModelAndView createNewAccount(
			@ModelAttribute("UserVO") UserVO user) throws IOException{
		
		AccountUtil.db.put(user.getUsername(), user);
		
		return new ModelAndView("redirect:/", "UserVO", new UserVO());
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView logout(
			@ModelAttribute("UserVO") UserVO user,
			HttpServletRequest request,
			HttpServletResponse response) throws IOException{
	
		request.getSession().invalidate();
		
		return new ModelAndView("redirect:/", "UserVO", new UserVO());
	}
}
