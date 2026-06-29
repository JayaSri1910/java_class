package com.codegnan.oopprogramming;

public class Test {

	public static void main(String[] args) {
		Parent p1=new Parent();
		p1.property();
		p1.Marry();
		Parent p2=new Child();
		p2.property();
		p2.Marry();
		Child c1=new Child();
		c1.property();
		c1.Marry();

	}

}
