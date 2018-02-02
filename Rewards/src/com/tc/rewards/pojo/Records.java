package com.tc.rewards.pojo;

import java.util.Date;

public class Records {
	private String id;
	private String scoreChange;
	private String scoreUse;
	private String scoreSurplus;
	private Date   buydate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScoreChange() {
		return scoreChange;
	}
	public void setScoreChange(String scoreChange) {
		this.scoreChange = scoreChange;
	}
	public String getScoreUse() {
		return scoreUse;
	}
	public void setScoreUse(String scoreUse) {
		this.scoreUse = scoreUse;
	}
	public String getScoreSurplus() {
		return scoreSurplus;
	}
	public void setScoreSurplus(String scoreSurplus) {
		this.scoreSurplus = scoreSurplus;
	}
	public Date getBuydate() {
		return buydate;
	}
	public void setBuydate(Date buydate) {
		this.buydate = buydate;
	}
	
	
}
