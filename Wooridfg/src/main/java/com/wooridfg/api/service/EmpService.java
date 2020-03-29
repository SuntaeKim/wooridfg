package com.wooridfg.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.EmpInfo;
import com.wooridfg.api.mapper.EmpMapper;

@Service
public class EmpService {
	@Autowired EmpMapper empMapper;
	
	public List<EmpInfo> getAll() throws Exception{
        return empMapper.getAll();
    }
	 
	public List<EmpInfo> getByEmpnm(String empNm) throws Exception{
		return empMapper.getByEmpnm(empNm);
	}

}
