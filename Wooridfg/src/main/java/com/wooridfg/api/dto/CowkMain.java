package com.wooridfg.api.dto;

public class CowkMain {
	private String rgsDt;
	private String rgsDcd;
	private int rgsEmpNo;
	private int rcmdEmpNo;
	private String cowkDesc;
	private String cowkPfms;
	public String getRgsDt() {
		return rgsDt;
	}
	public void setRgsDt(String rgsDt) {
		this.rgsDt = rgsDt;
	}
	public String getRgsDcd() {
		return rgsDcd;
	}
	public void setRgsDcd(String rgsDcd) {
		this.rgsDcd = rgsDcd;
	}
	public int getRgsEmpNo() {
		return rgsEmpNo;
	}
	public void setRgsEmpNo(int rgsEmpNo) {
		this.rgsEmpNo = rgsEmpNo;
	}
	public int getRcmdEmpNo() {
		return rcmdEmpNo;
	}
	public void setRcmdEmpNo(int rcmdEmpNo) {
		this.rcmdEmpNo = rcmdEmpNo;
	}
	public String getCowkDesc() {
		return cowkDesc;
	}
	public void setCowkDesc(String cowkDesc) {
		this.cowkDesc = cowkDesc;
	}
	public String getCowkPfms() {
		return cowkPfms;
	}
	public void setCowkPfms(String cowkPfms) {
		this.cowkPfms = cowkPfms;
	}
	@Override
	public String toString() {
		return "CowkMain [rgsDt=" + rgsDt + ", rgsDcd=" + rgsDcd + ", rgsEmpNo=" + rgsEmpNo + ", rcmdEmpNo=" + rcmdEmpNo
				+ ", cowkDesc=" + cowkDesc + ", cowkPfms=" + cowkPfms + "]";
	}
	
}
