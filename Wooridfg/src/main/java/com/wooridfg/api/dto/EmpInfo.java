package com.wooridfg.api.dto;

public class EmpInfo {
	private int empNo;
	private String empNm;
	private String title;
	private String dptmt;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
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
		return "EmpInfo [empNo=" + empNo + ", empNm=" + empNm + ", title=" + title + ", dptmt=" + dptmt + "]";
	}
	
}
