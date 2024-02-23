package org.except;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private String docId;
	private String docName;
	
	private ArrayList<Appointment> apptList = new ArrayList<Appointment>();

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public ArrayList<Appointment> getApptList() {
		return apptList;
	}

//	public void setApptList(ArrayList<Appointment> apptList) {
//		this.apptList = apptList;
//	}
	
	public void addAppointment(Appointment appointment) {
		apptList.add(appointment);
	}
	
	public void printAppointment() {
		for(Appointment appointment: apptList) {
			System.out.println(appointment);
		}
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", docName=" + docName + ", apptList=" + apptList + "]";
	}
	
}
