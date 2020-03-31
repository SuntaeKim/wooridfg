package com.wooridfg.api.dto;

public class RgsMain {
	private String rgsDt;
	private int rgsEmpNo;
	private String rgsEmpNm;
	private String cowkDesc;
	private String cowkDtl;
	private String cowkEmpNm;
	private String cowkEmpNm2;
	private String cowkEmpNm3;
	
	
	public String getRgsDt() {
		return rgsDt;
	}
	public void setRgsDt(String rgsDt) {
		this.rgsDt = rgsDt;
	}
	public int getRgsEmpNo() {
		return rgsEmpNo;
	}
	public void setRgsEmpNo(int rgsEmpNo) {
		this.rgsEmpNo = rgsEmpNo;
	}
	public String getRgsEmpNm() {
		return rgsEmpNm;
	}
	public void setRgsEmpNm(String rgsEmpNm) {
		this.rgsEmpNm = rgsEmpNm;
	}
	public String getCowkDesc() {
		return cowkDesc;
	}
	public void setCowkDesc(String cowkDesc) {
		this.cowkDesc = cowkDesc;
	}
	public String getCowkDtl() {
		return cowkDtl;
	}
	public void setCowkDtl(String cowkDtl) {
		this.cowkDtl = cowkDtl;
	}
	public String getCowkEmpNm() {
		return cowkEmpNm;
	}
	public void setCowkEmpNm(String cowkEmpNm) {
		this.cowkEmpNm = cowkEmpNm;
	}
	public String getCowkEmpNm2() {
		return cowkEmpNm2;
	}
	public void setCowkEmpNm2(String cowkEmpNm2) {
		this.cowkEmpNm2 = cowkEmpNm2;
	}
	public String getCowkEmpNm3() {
		return cowkEmpNm3;
	}
	public void setCowkEmpNm3(String cowkEmpNm3) {
		this.cowkEmpNm3 = cowkEmpNm3;
	}
	@Override
	public String toString() {
		return "RgsMain [rgsDt=" + rgsDt + ", rgsEmpNo=" + rgsEmpNo + ", rgsEmpNm=" + rgsEmpNm + ", cowkDesc="
				+ cowkDesc + ", cowkDtl=" + cowkDtl + ", cowkEmpNm=" + cowkEmpNm + ", cowkEmpNm2=" + cowkEmpNm2
				+ ", cowkEmpNm3=" + cowkEmpNm3 + "]";
	}
	
}
