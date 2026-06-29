package com.codegnan.oopprogramming;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");//hello
		String str=sc.next();
		String result=" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		
		if(result.indexOf(ch)==-1) {
			result+=ch;
		}
		}
		System.out.print(result);
		sc.close();

	}

}
