package com.codegnan.oopprogramming;

public interface Vechicle {
	int MAX_SPEED=200;
	String FUEL_TYPE="Petrol";
	void start();
	void stop();
	void brake();
	void accelerate();
	int getCurrentSpeed();

}
