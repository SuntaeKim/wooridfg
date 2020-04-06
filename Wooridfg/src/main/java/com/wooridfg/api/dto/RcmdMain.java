package com.wooridfg.api.dto;

public class RcmdMain {
	private String rgsDt;
	private int rcmdEmpNo;
	private String rcmdEmpNm;
	private String cowkDesc;
	private String cowkPfms;
	private String imprsPnt;
	private String rgsEmpNm;
	private int rgsEmpNo;
	
	public int getRgsEmpNo() {
		return rgsEmpNo;
	}
	public void setRgsEmpNo(int rgsEmpNo) {
		this.rgsEmpNo = rgsEmpNo;
	}
	public String getRgsDt() {
		return rgsDt;
	}
	public void setRgsDt(String rgsDt) {
		this.rgsDt = rgsDt;
	}
	public int getRcmdEmpNo() {
		return rcmdEmpNo;
	}
	public void setRcmdEmpNo(int rcmdEmpNo) {
		this.rcmdEmpNo = rcmdEmpNo;
	}
	public String getRcmdEmpNm() {
		return rcmdEmpNm;
	}
	public void setRcmdEmpNm(String rcmdEmpNm) {
		this.rcmdEmpNm = rcmdEmpNm;
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
	public String getImprsPnt() {
		return imprsPnt;
	}
	public void setImprsPnt(String imprsPnt) {
		this.imprsPnt = imprsPnt;
	}
	public String getRgsEmpNm() {
		return rgsEmpNm;
	}
	public void setRgsEmpNm(String rgsEmpNm) {
		this.rgsEmpNm = rgsEmpNm;
	}
	@Override
	public String toString() {
		return "RcmdMain [rgsDt=" + rgsDt + ", rcmdEmpNo=" + rcmdEmpNo + ", rcmdEmpNm=" + rcmdEmpNm + ", cowkDesc="
				+ cowkDesc + ", cowkPfms=" + cowkPfms + ", imprsPnt=" + imprsPnt + ", rgsEmpNm=" + rgsEmpNm
				+ ", rgsEmpNo=" + rgsEmpNo + "]";
	}

	
	
}
