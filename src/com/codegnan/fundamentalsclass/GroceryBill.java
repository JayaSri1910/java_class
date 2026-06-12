package com.codegnan.fundamentalsclass;
import java.util.Scanner;
public class GroceryBill {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter unit price:");
	double price=sc.nextDouble();
	System.out.println("Enter quantity:");
	int quantity=sc.nextInt();
	double total=price*quantity;
	System.out.println("Total Amount :"+(int)total);
	}

}
