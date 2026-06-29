package com.codegnan.oopprogramming;

import java.util.Scanner;

public class EachCharacterCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				char ch1=str.charAt(j);
				if(ch==ch1) {
					count++;
				}
			}
			System.out.println(ch+"="+count);
		}
		sc.close();
		}

}
