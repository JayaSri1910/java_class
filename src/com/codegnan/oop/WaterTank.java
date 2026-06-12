package com.codegnan.oop;

import java.util.Scanner;

public class WaterTank {
	private int currentlevel=0;
	private int maxlevel=0;
public void setCurrentLevel(int currentlevel) {
	if(currentlevel>=0 && currentlevel<=500) {
		this.currentlevel=currentlevel;
	}
	  if(currentlevel>maxlevel) {
		maxlevel=currentlevel;
	   } 
     }
public int getCurrentlevel() {
	return currentlevel;
}
public int getMaxlevel(){
	return maxlevel;
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	WaterTank watertank=new WaterTank();
	int level;
	while(true) {
		level=sc.nextInt();
		if(level==-999) {
			break;
		}
		watertank.setCurrentLevel(level);
	}
	System.out.println(watertank.getCurrentlevel());
	System.out.println(watertank.getMaxlevel());
	sc.close();
}

}
