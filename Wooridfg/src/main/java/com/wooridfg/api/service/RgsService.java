package com.wooridfg.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.RgsMain;
import com.wooridfg.api.mapper.RgsMapper;

@Service
public class RgsService {
	@Autowired RgsMapper rgsMapper;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<RgsMain> getAllRgs() throws Exception{
		
		return rgsMapper.getAllRgs();
	}
	
	public void insertRgs(RgsMain Rgs) throws Exception{
		logger.debug("RgsMain = ", Rgs.toString());
		
		rgsMapper.insertRgs(Rgs);
	}	
}