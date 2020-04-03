package com.wooridfg.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wooridfg.api.dto.Dashboard;
import com.wooridfg.api.dto.RgsMain;
import com.wooridfg.api.mapper.DashboardMapper;
import com.wooridfg.api.mapper.RgsMapper;

@Service
public class DashboardService {
	@Autowired DashboardMapper dbMapper;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public List<Dashboard> getDashboard() throws Exception{
		
		List<Dashboard> result = dbMapper.getRcmdTop5();

		result.addAll(dbMapper.getRgsTop5());
		result.addAll(dbMapper.getDptmtCnt());
		
		return result;
	}
}


