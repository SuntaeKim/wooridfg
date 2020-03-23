package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.EmpInfo;

public interface EmpMapper {

	public List<EmpInfo> getAll() throws Exception;

	public EmpInfo getByEmpno(int empNo) throws Exception;

}
