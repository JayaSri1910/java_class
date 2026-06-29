package com.codegnan.oopprogramming;

public class SimplePasswordChecker implements PasswordChecker{
    @Override
	public String checkLength(String password) {
		return ("length:"+password.length());
	}

	public String checkComplexity(String password) {
		if(password.length()<8) {
			return "weak";
		}else {
			if(password.length()==8) {
				return "Medium";
			}else {
				return "Strong";
			}
		}
	}

}
