package com.tc.rewards.expand;

import com.tc.rewards.pojo.User;

public class UserExpand extends User{

	private String rname;
	private String gname;
	private String sNumber;
	
	
	public String getsNumber() {
		return sNumber;
	}
	public void setsNumber(String sNumber) {
		this.sNumber = sNumber;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	
	
}
