package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DoctorAppointment extends Appointment {
	public void schedule() {
		Scanner sc=new Scanner(System.in);
		System.out.print("specilization:");
		String specilization=sc.next();
		System.out.println("Doctor Appointment Scheduled for"+specilization);
		sc.close();
	}

}
