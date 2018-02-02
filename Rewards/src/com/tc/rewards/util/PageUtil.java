package com.tc.rewards.util;
/**
 * 
 * @author TC1016
 *
 */

public class PageUtil {
	private int skipNum;//��ǰ�ڼ�����¼��ʼ
	private int takeNum;//�ӿ�ʼ��¼��ʼÿҳ��ʾ����
	private int curentPage=1;//��ǰҳ
	private int pageSize=9;//ÿҳ��ʾ��¼��
	private int count;//ͳ��������
	private int pageCount;//����ҳ��ҳ��
	
	
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