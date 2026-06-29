package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");//hello
		String str=sc.next();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i)+" ");
				}
			}
		}
		sc.close();

	}

}
