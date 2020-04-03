package com.wooridfg.api.dto;

public class Dashboard {
	private String item;
	private String name;
	private int cnt;
	private String title;
	private String dptmt;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDptmt() {
		return dptmt;
	}
	public void setDptmt(String dptmt) {
		this.dptmt = dptmt;
	}
	
	@Override
	public String toString() {
		return "Dashboard [item=" + item + ", name=" + name + ", cnt=" + cnt + ", title=" + title + ", dptmt=" + dptmt
				+ "]";
	}

}
