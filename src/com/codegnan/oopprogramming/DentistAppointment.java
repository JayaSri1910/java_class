package com.codegnan.oopprogramming;

import java.util.Scanner;

public class DentistAppointment extends Appointment {
public void schedule() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Dental procedure:");
    String procedure=sc.next();
    System.out.println("Dentist Appointment scheduled for"+procedure);
    sc.close();
}
}
