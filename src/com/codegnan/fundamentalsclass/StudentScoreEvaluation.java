package com.codegnan.fundamentalsclass;
import java.util.Scanner;
public class StudentScoreEvaluation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int total=0;
		total+=s1;
		total+=s2;
		total+=s3;
		int average=total/3;
		boolean isAvgOk=average>=50;
		boolean areScoreOK=(s1>40)&&(s2>40)&&(s3>40);
		boolean isEligible=isAvgOk && areScoreOK;
		System.out.println(total);
		System.out.println(average);
		System.out.println(isEligible);
		
		

	}

}
