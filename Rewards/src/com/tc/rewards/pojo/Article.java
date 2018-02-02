package com.tc.rewards.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Article {
	private String id;
	private String name;
/*	@Min(value=1 ,message="不能少于一件")
	@Max(value=500,message="不能超过500件")*/
	private String number;
	/*@NotEmpty(message = "商品类型还没有选择呢！")*/
	private String typeId;
	private String exchangeId;
	private String image;
	private String describes;
	private String exchangeScore;
	
	public String getExchangeScore() {
		return exchangeScore;
	}
	public void setExchangeScore(String exchangeScore) {
		this.exchangeScore = exchangeScore;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescribes() {
		return describes;
	}
	public void setDescribes(String describes) {
		this.describes = describes;
	}
	public String getExchageScore() {
		return exchageScore;
	}
	public void setExchageScore(String exchageScore) {
		this.exchageScore = exchageScore;
	}
	private String exchageScore;
	
	
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
		return "Article [id=" + id + ", name=" + name + ", number=" + number
				+ ", typeId=" + typeId + ", exchangeId=" + exchangeId
				+ ", image=" + image + ", describes=" + describes
				+ ", exchageScore=" + exchageScore + "]";
	}
	
	
}
