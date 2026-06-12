package com.codegnan.oop;

public class MethodOverloadingDemo {
void test() {
	System.out.println("No parameters");
}
void test(int a,int b) {
	System.out.println("A and B is " +a+" "+b);
}
void test(double a) {
	System.out.println("inside test(double)a"+a);
}
	public static void main(String[] args) {
		MethodOverloadingDemo od=new MethodOverloadingDemo();
		od.test();
		od.test(10,20);
		od.test(10.5);

	}

}
