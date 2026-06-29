package com.codegnan.oopprogramming;

public class AnagramChecker {

	public static void main(String[] args) {
		String s1="eat";
		String s2="jaya";
		//check if lengths are equals
		if(s1.length()!=s2.length()) {
			System.out.println("Not Anagrams");
			return;//stop execution
		}
//step3:assume  strings are anagrams
		boolean isAnagram=true;
		//trace each character of first string
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int count1=0;
			int count2=0;
			for(int j=0;j<s1.length();j++) {
				if(ch==s1.charAt(j)) {
					count1++;
				}
			}
			for(int j=0;j<s2.length();j++) {
				if(ch==s2.charAt(j)) {
					count2++;
				}
			}
			//compare counts
			//If counts
			if(count1!=count2) {
				isAnagram=false;
				break;//exit loop early
			}
			}
		//Final result
		if(isAnagram) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		}

	}


