package com.codegnan.fundamentalsclass;

public class FrequencyCounter {

	public static void main(String[] args) {
		int[] array= {1,2,3,2,1,4,1,5,1};
		//boolean array to keep track of elements
		//that have been alreay counted
		boolean[] processed=new boolean[array.length];
		for(int i=0;i<array.length;i++) {
			if(processed[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]==array[i]) {
					count++;
					processed[j]=true;
				}
			}
			System.out.println(array[i]+"occurs"+count+"times");
			
		}

	}

}
