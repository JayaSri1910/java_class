package com.codegnan.Exception;

public class MarriageEligibilityChecker  {
public void checkEligibility(int age) throws TooYoungException,TooOldException{
	if(age<18) {
		throw new TooYoungException("Marriage cannot be approved.age is below 18 years");
	}else {
		if(age>60) {
			throw new TooOldException("Marriage cannot be approved age is above 60 years");
		}else {
			System.out.println("marriage aprroved details will be processed soon");
		}
	}
}
public static void main(String[] args) {
	MarriageEligibilityChecker checker=new MarriageEligibilityChecker();
	try {
		checker.checkEligibility(27);
	}catch(TooYoungException|TooOldException e) {
		e.printStackTrace();
	}
	
}
}
