package com.codegnan.oopprogramming;

public class MultileInterfaceDemo {
	public static void main(String[] args) {
		Human human=new Human("mani");
		Robot robot=new Robot("R2D2");
		System.out.println("Human Daily Routine");
		human.showStatus();
		human.work();
		human.work();
		human.takeBreak();
		human.eat();
		human.digest();
		human.work();
		human.sleep();
		human.wakeup();
		human.showStatus();
		System.out.println("Robot Operations");
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.takeBreak();
		robot.charge();
		robot.work();
		
		
	}
	

}
