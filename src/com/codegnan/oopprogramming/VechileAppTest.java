package com.codegnan.oopprogramming;

public class VechileAppTest {

	public static void main(String[] args) {
		Vechile v=new Bus();
		System.out.println(v.getNoOfWheels());
		v=new Auto();
		System.out.println(v.getNoOfWheels());
		}
}
