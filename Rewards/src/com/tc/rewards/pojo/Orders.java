package com.tc.rewards.pojo;

import java.util.Date;

public class Orders {
	private String id;
	private String orderNumber;
	private String orderName;
	private Date orderTime; 
	private String userId;
	private String exchangeScore;
	private String exchangeNumber;
	private String scoreId;
	
	
	public String getScoreId() {
		return scoreId;
	}
	public void setScoreId(String scoreId) {
		this.scoreId = scoreId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getExchangeScore() {
		return exchangeScore;
	}
	public void setExchangeScore(String exchangeScore) {
		this.exchangeScore = exchangeScore;
	}
	public String getExchangeNumber() {
		return exchangeNumber;
	}
	public void setExchangeNumber(String exchangeNumber) {
		this.exchangeNumber = exchangeNumber;
	}
	
	
	
}
