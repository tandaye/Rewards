package com.tc.rewards.pojo;

public class User {
	
	private String id;
	private String name;
	private String age; 
	private String sex;
	private String password; 
	private String grageId;
	private String roleId;
	private String addressId;
	private String scoreId;
	private String orderId;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGrageId() {
		return grageId;
	}
	public void setGrageId(String grageId) {
		this.grageId = grageId;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", sex="
				+ sex + ", password=" + password + ", grageId=" + grageId
				+ ", roleId=" + roleId + ", addressId=" + addressId
				+ ", scoreId=" + scoreId + "]";
	}
	
	
}
