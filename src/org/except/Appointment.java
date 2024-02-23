package org.except;

import java.util.Date;

public class Appointment{

	private Date appDate;
	private int noOfPatients;
	
	public Appointment() {
		
	}
	
	public Appointment(Date appDate, int noOfPatients) {
		
		this.appDate = appDate;
		this.noOfPatients = noOfPatients;
	}
	public Date getAppDate() {
		return appDate;
	}
	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) throws InvalidDataException{
		if(noOfPatients>1 && noOfPatients<15) {
			this.noOfPatients = noOfPatients;
		}else {
			throw new InvalidDataException("Number of patients must be between 1 and 15");
		}
		
	}
	@Override
	public String toString() {
		return "Appointment [appDate=" + appDate + ", noOfPatients=" + noOfPatients + "]";
	}
	
	
	
	
}
