package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.Dashboard;

public interface DashboardMapper {

	public List<Dashboard> getRcmdTop5() throws Exception;
	
	public List<Dashboard> getRgsTop5() throws Exception;

	public List<Dashboard> getDptmtCnt() throws Exception;

}
