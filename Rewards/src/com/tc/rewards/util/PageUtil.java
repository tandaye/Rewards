package com.tc.rewards.util;
/**
 * 
 * @author TC1016
 *
 */

public class PageUtil {
	private int skipNum;//当前第几条记录开始
	private int takeNum;//从开始记录开始每页显示条数
	private int curentPage=1;//当前页
	private int pageSize=9;//每页显示记录数
	private int count;//统计总条数
	private int pageCount;//多少页，页码
	
	
	public int getSkipNum() {
		return (curentPage-1)*pageSize;
	}
	

	public int getTakeNum() {
		return pageSize;
	}

	
	
	public int getCurentPage() {
		return curentPage;
	}
	public void setCurentPage(int curentPage) {
		this.curentPage = curentPage;
	}
	
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	public int getPageCount() {
		return pageCount=(int) Math.ceil((float)count/pageSize);
	}
	
	
}
