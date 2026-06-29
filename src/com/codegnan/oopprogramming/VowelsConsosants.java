package com.codegnan.oopprogramming;

import java.util.Scanner;

public class VowelsConsosants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
		   char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					System.out.println(ch+ " is a Vowel");
				}
				else {
					System.out.println(ch+ " is a Consosant");
				}
			}
		}
		   sc.close();
	

	}
}
