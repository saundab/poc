package TryWebsite1.website.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import TryWebsite1.website.model.UserVO;

@Controller
public class HomeController {

	@RequestMapping(value="/")	
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		return new ModelAndView("home", "UserVO", new UserVO());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("UserVO") UserVO userVO, 
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException{
		
		UserVO dbUser = null;
		if((dbUser=AccountUtil.getUser(userVO))==null){
			return new ModelAndView("home", "UserVO", new UserVO());
		}
		
		if(!dbUser.getPassword().equalsIgnoreCase(userVO.getPassword())){
			return new ModelAndView("home", "UserVO", new UserVO());
		}
		
		request.getSession().setAttribute("userdata", userVO);
		
		return new ModelAndView("redirect:account/view");
	}
	
	@RequestMapping(value="/createAccount", method=RequestMethod.GET)
	public ModelAndView createAccount( HttpServletResponse response) throws IOException{

		return  new ModelAndView("createaccount", "UserVO", new UserVO());
	}
}
