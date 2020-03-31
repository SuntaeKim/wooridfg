package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.RcmdMain;
import com.wooridfg.api.dto.RgsMain;

public interface RgsMapper {

	public List<RgsMain> getAllRgs() throws Exception;
	
	public void insertRgs(RgsMain rgs) throws Exception;
}
