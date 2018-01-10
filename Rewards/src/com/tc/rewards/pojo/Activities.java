package com.tc.rewards.pojo;

public class Activities {
	private String id;
	private String name;
	private String number;
	private String typeId;
	private String exchangeId;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getExchangeId() {
		return exchangeId;
	}
	public void setExchangeId(String exchangeId) {
		this.exchangeId = exchangeId;
	}
	@Override
	public String toString() {
		return "Activities [id=" + id + ", name=" + name + ", number=" + number
				+ ", typeId=" + typeId + ", exchangeId=" + exchangeId
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
