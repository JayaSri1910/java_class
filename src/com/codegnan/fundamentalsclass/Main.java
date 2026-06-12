package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String[] strings= {"madam","racecar","level","java","jaya"};
	 for(String str:strings) {
		 System.out.println(str+"is"+(ispalindrome(str)?"is a pali"));
	 }
	 sc.close();
	 

	}

}
