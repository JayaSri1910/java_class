package com.codegnan.oopprogramming;

public class Human implements Workable,Eatable,Sleepable{
        private String name;
		private boolean isAwake;
		private boolean isWorking;
		private int energyLevel;
		public Human(String name)
		{
			this.name=name;
			this.isAwake=true;
			this.isWorking=false;
			this.energyLevel=100;
		}
		@Override
		public void work() {
			if(isAwake && energyLevel>20)
			{
				isWorking=true;
				energyLevel-=20;
				System.out.println(name +" is working, Energy Level : "+energyLevel);
			}
			else {
				System.out.println(name+" is too tired to work");
				
			}
		}		
		
		public void takeBreak() {
			if(isWorking)
			{
				isWorking=false;
				energyLevel+=20;
				System.out.println(name+" is taking break, Energy Level : "+energyLevel);
			}
			
		}
		
		public void eat() {
			energyLevel+=30;
			if(energyLevel>100)
			{
				energyLevel=100;
			}
			System.out.println(name+" is eating. Energy Level : "+energyLevel);
			
		}
		public void digest() {
				System.out.println(name+ " is a digesting food");
			}
			
		
		
		public void sleep() {
			isAwake=false;
			isWorking = false;
			energyLevel=100;
			System.out.println(name+" is sleeping and energy restored to  :"+energyLevel);
			
		}
		@Override
		public void wakeup() {
			isAwake=true;
			System.out.println(name+" wake up refresh");
		}
		public void showStatus()
		{
			System.out.println("======"+name+" status===============");
			System.out.println("Awake: "+isAwake);
			System.out.println("Working: "+isWorking);
			System.out.println("Energy: "+energyLevel);
		}
}


				