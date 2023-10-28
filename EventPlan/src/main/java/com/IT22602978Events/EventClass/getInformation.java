package com.IT22602978Events.EventClass;

public class getInformation {
	
	private int reservationsid;
	private String fulllname;
	private String phonenum;
	private String email;
	private String datetime;
	private String eventtype;
	private String packagetype;
	private String specialrqst;
	
	//create the constructor for the class
	public getInformation(int reservationsid, String fulllname, String phonenum, String email, String datetime,
			String eventtype, String packagetype, String specialrqst) {
	
		this.reservationsid = reservationsid;
		this.fulllname = fulllname;
		this.phonenum = phonenum;
		this.email = email;
		this.datetime = datetime;
		this.eventtype = eventtype;
		this.packagetype = packagetype;
		this.specialrqst = specialrqst;
	}
	// return thr value with using get method 
	public int getReservationsid() {
		return reservationsid;
	}
	public String getFulllname() {
		return fulllname;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public String getEmail() {
		return email;
	}
	public String getDatetime() {
		return datetime;
	}
	public String getEventtype() {
		return eventtype;
	}
	public String getPackagetype() {
		return packagetype;
	}
	public String getSpecialrqst() {
		return specialrqst;
	}

	

}
