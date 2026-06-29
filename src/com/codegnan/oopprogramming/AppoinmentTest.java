package com.codegnan.oopprogramming;

public class AppoinmentTest {

	public static void main(String[] args) {
		Appointment appoinment=new Appointment();
		DoctorAppointment doctorappoinment=new DoctorAppointment();
		DentistAppointment dentistappoinment=new DentistAppointment();
		appoinment.schedule();
		doctorappoinment.schedule();
		dentistappoinment.schedule();
}

}
