package com.wooridfg.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.RcmdMain;
import com.wooridfg.api.mapper.RcmdMapper;

@Service
public class RcmdService {
	@Autowired RcmdMapper rcmdMapper;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<RcmdMain> getAllRcmd() throws Exception{
		
		return rcmdMapper.getAllRcmd();
	}
	
	public void insertRcmd(RcmdMain rcmd) throws Exception{
		logger.debug("RcmdMain = ", rcmd.toString());
		
		rcmdMapper.insertRcmd(rcmd);
	}	
}