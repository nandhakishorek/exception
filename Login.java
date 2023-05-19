package com.onesoft.c_Exception_;

public class Login {
	public void checkPassword(String password)  throws PasswordException{
		try {
			if(password.length()<8) {
				throw new PasswordException("Password must contain above 8 letters");
			}
			else {
				System.out.println("Login Successfully");
			}
		}
		catch(PasswordException a) {
			System.out.println(a);
		}
	}
}
