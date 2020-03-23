package com.wooridfg.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.CowkMain;
import com.wooridfg.api.mapper.CowkMapper;

@Service
public class CowkService {
	@Autowired CowkMapper cowkMapper;
	
	public List<CowkMain> getByRcmd(int rcmdEmpNo) throws Exception{
		return cowkMapper.getByRcmd(rcmdEmpNo);
	}
	
	public void insertCowk(CowkMain cowk) throws Exception{
		
		System.out.println("ttttttttttttt :"+ cowk);
		cowkMapper.insertCowk(cowk);
	}	
}