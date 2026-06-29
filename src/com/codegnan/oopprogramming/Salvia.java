package com.codegnan.oopprogramming;

public class Salvia implements Car {
	@Override
	public void turnDirection(String dir) {
		if(dir.equals("Left")||dir.equals("left")) {
			System.out.println("Salvia is turning left");
		}
		if(dir.equals("Right")||dir.equals("right")) {
			System.out.println("Salvia is turning right");
		}
		
	}
	@Override
	public void accelarate(int points) {
		if(points>=10 && points<=100) {
			System.out.println("Salvia speed is:"+points);
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Forturner has stopped");
		}
	public void sunRoof() {
		System.out.println("");
	}
}



