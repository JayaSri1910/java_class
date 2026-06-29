package com.codegnan.oopprogramming;

public class Forturner implements Car {

	@Override
	public void turnDirection(String dir) {
		if(dir.equals("Left")||dir.equals("left")) {
			System.out.println("Forturner is turning left");
		}
		if(dir.equals("Right")||dir.equals("right")) {
			System.out.println("Forturner is turning right");
		}
		
	}

	@Override
	public void accelarate(int points) {
		if(points>=10 && points<=100) {
			System.out.println("Forturner speed is:"+points);
		}
		
	}

	@Override
	public void stop() {
		System.out.println("Forturner has stopped");
		}
	public void fourwheels() {
		System.out.println("");
	}

}
