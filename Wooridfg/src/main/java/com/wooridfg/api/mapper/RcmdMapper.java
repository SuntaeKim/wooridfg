package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.RcmdMain;

public interface RcmdMapper {

	public List<RcmdMain> getAllRcmd() throws Exception;
	
	public void insertRcmd(RcmdMain rcmd) throws Exception;
}
