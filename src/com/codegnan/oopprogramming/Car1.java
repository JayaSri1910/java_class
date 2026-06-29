package com.codegnan.oopprogramming;

public class Car1 implements Vechicle {
private int currentSpeed;
private boolean isEngineOn;

	public Car1(int currentSpeed, boolean isEngineOn) {
	super();
	this.currentSpeed = 0;
	this.isEngineOn = false;
}
    @Override
	public void start() {
		isEngineOn=true;
		System.out.println("Car Enginee Started");
		}

	@Override
	public void stop() {
		currentSpeed=0;
		isEngineOn=false;
		System.out.println("Car Stopped");
		
	}

	@Override
	public void brake() {
		if(currentSpeed>0) {
			currentSpeed-=15;
			if(currentSpeed<0) {
				currentSpeed=0;
				System.out.println("Car braking.current speed:"+currentSpeed);
			}
		}
		
	}

	public void accelerate() {
		if(isEngineOn&&currentSpeed<MAX_SPEED) {
			currentSpeed+=10;
			System.out.println("Car Accelarating.current speed:"+currentSpeed);
		}
		
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	}
