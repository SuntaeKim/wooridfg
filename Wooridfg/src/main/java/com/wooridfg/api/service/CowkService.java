package com.wooridfg.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.CowkMain;
import com.wooridfg.api.mapper.CowkMapper;

@Service
public class CowkService {
	@Autowired CowkMapper cowkMapper;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<CowkMain> getByRcmd(int rcmdEmpNo) throws Exception{
		
		logger.debug("rcmdEmpNO = ", rcmdEmpNo);
		
		return cowkMapper.getByRcmd(rcmdEmpNo);
	}
	
	public void insertCowk(CowkMain cowk) throws Exception{
		logger.debug("CowkMain = ", cowk.toString());
		
		cowkMapper.insertCowk(cowk);
	}	
}