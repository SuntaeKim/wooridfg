package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.EmpInfo;

public interface EmpMapper {

	public List<EmpInfo> getAll() throws Exception;

	public List<EmpInfo> getByEmpnm(String empNm) throws Exception;
	
	public String validationEmpno(int empNo) throws Exception;
	
	public String validationLogin(int empNo, String empNm) throws Exception;

}
