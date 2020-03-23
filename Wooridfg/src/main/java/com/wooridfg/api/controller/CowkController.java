package com.wooridfg.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wooridfg.api.dto.CowkMain;
import com.wooridfg.api.service.CowkService;

@RestController
@RequestMapping("/cowk")
public class CowkController {
	@Autowired
	CowkService cowkService;
	
	@RequestMapping(value = "/{empno}")
	public ResponseEntity<List<CowkMain>> getByEmpno(@PathVariable("empno") int rcmdEmpNo) throws Exception {
		List<CowkMain> list = cowkService.getByRcmd(rcmdEmpNo); 
		return new ResponseEntity<List<CowkMain>>(list, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<CowkMain> insertCowk(@RequestBody CowkMain cowk) throws Exception{
		cowkService.insertCowk(cowk);
		return new ResponseEntity<CowkMain>(HttpStatus.OK);
	}
}
