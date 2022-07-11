package com.cdac.filter;

public class LoginService {
		public boolean loginCheck(String username,String password) {
			if(username.equals("anuragm")&&password.equals("Anurag@123")) {
				return true;
			}else {
				return false;
			}
		}
}
