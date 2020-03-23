package com.wooridfg.api.mapper;

import java.util.List;

import com.wooridfg.api.dto.CowkMain;

public interface CowkMapper {

	public List<CowkMain> getByRcmd(int rcmdEmpNo) throws Exception;
	
	public void insertCowk(CowkMain cowk) throws Exception;
}
