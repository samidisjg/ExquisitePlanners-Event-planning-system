package com.IT22602978Events.EventClass;

public class Decoration_Info extends getInformation{
	    private int attendees;
	    private String specialrqst;

	    public Decoration_Info(int reservationsid, String eventtype, int attendees, String specialrqst) {
	    	//inherit the values from parent class
	        super(reservationsid, null, null, null, null, eventtype, null, null);
	        this.attendees = attendees;
	        this.specialrqst = specialrqst;
	    }

	    public int getAttendees() {
	        return attendees;
	    }

	    public String getSpecialrqst() {
	        return specialrqst;
	    }
	
	
	
	
}
