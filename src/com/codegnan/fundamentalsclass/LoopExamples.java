package com.codegnan.fundamentalsclass;

import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		
		/*while(i<=n) {
			System.out.println(i);
			i=i+2;
		}*/
		/*do {
			System.out.println(i);
			i=i+2;
		}while(i<=n);*/
		for(int i=0;i<n;i++) {
			System.out.println(i);
		}
		sc.close();

	}

}
