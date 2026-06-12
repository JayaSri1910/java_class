package com.codegnan.fundamentalsclass;
import java.util.Scanner;
public class GradeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks:");
		int marks=sc.nextInt();
		char grade=(marks>90)?'A':
			(marks>=80)&&(marks<90)?'B':
				(marks>=70)&&(marks<80)?'C':
					(marks>=60)&&(marks<70)?'D':(marks>50)&&(marks<60)?'E':'F';
		System.out.println("Student Marks:"+marks);
		System.out.println("Student Grade:"+grade);

	}

}
