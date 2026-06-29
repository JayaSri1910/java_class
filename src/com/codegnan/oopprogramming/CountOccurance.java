package com.codegnan.oopprogramming;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char targetcharacter=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==targetcharacter) {
				count++;
			}
			}
		System.out.println(count);
		sc.close();

	}

}
