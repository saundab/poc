package TryWebsite1.website.controller;

import java.util.HashMap;
import java.util.Map;

import TryWebsite1.website.model.UserVO;

public class AccountUtil {

	//uuid - data
	static Map<String, UserVO> sessionMap = new HashMap<String, UserVO>();
	
	//username - data
	static Map<String, UserVO> db = new HashMap<String, UserVO>();
	
	public static boolean isValidUser(UserVO user) {
		// TODO Auto-generated method stub
		return false;
	}

	public static UserVO getUser(UserVO user) {
		if(user!=null && user.getUsername()!=null)
			return db.get(user.getUsername());
	
		return null;
	}
}
