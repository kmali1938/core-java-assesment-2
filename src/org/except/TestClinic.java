package org.except;

import java.util.Date;
import java.util.Scanner;

public class TestClinic extends InvalidDataException{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor[] doctors = new Doctor[2];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details of Doctors: ");
		for(int i=0;i<doctors.length;i++) {
			System.out.println("Enter doctor id for doctor - "+(i+1)+" : ");
			String docId = sc.next();
			System.out.println("Enter doctor name for doctor - "+(i+1)+" : ");
			String name = sc.next();
			
			Doctor doctor = new Doctor();
			doctor.setDocId(docId);
			doctor.setDocName(name);
			
			for(int j=0;j<2;j++) {
	        	Appointment appointment = new Appointment();
	        	System.out.println("Enter appointment details for doctor : ");
	        	appointment.setAppDate( new Date());
	        	try {
	        		System.out.println("Enter number of patients for the appointment between 1 and 15 :");
	        		int n= sc.nextInt();
	        		appointment.setNoOfPatients(n);
	        		//doctors[i]=doctor;
	        	}catch(InvalidDataException e) {
	        		System.out.println("Invalid input entered. Please enter a number between 1 and 15");
	        		j--;
	        		continue;
	        	}
	        	doctor.addAppointment(appointment);
			}
			
			doctors[i]=doctor;
		}
		
		
        System.out.println("Details of Doctors:");
        for (int i = 0; i < doctors.length; i++) {
            System.out.println("Doctor " + (i + 1) + ":");
            System.out.println("ID: " + doctors[i].getDocId());
            System.out.println("Name: " + doctors[i].getDocName());
            System.out.println();
        }
        
       
		System.out.println("Enter id to retrive appointment details for doctor : ");
		String id = sc.next();
		for(Doctor doctor : doctors) {
			if(doctor.getDocId().equals(id)) {
				System.out.println("Appointment details are : ");
				doctor.printAppointment();
				break;
			}else {
				System.out.println("Id not found");
			}
		}
	}

}
