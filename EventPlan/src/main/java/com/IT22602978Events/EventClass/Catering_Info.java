package com.IT22602978Events.EventClass;

public class Catering_Info extends getInformation {
	    private int attendees;

	    public Catering_Info(int reservationsid, String eventtype, int attendees) {
	    	// inherit the values from parent class
	        super(reservationsid, null, null, null, null, eventtype, null, null);
	        this.attendees = attendees;
	    }

	    public int getAttendees() {
	        return attendees;
	    }
	
	
}
