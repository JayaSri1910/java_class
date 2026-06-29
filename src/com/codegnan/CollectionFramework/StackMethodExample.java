package com.codegnan.CollectionFramework;
import java.util.Stack;
public class StackMethodExample {

	public static void main(String[] args) {
		Stack<String> names=new Stack<>();
		names.push("sunny");
		names.push("bunny");
		names.push("vinny");
		names.push("chinny");
		names.push("junny");
		System.out.println(names);
		System.out.println(names.pop());
		System.out.println(names);
		System.out.println(names.peek());
		System.out.println(names);
		System.out.println(names.search("sunny"));
		
		

	}

}
