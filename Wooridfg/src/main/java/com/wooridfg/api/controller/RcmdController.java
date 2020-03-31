package com.wooridfg.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wooridfg.api.dto.RcmdMain;
import com.wooridfg.api.service.RcmdService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rcmd")
public class RcmdController {
	@Autowired
	RcmdService rcmdService;
	
	@RequestMapping
	public ResponseEntity<List<RcmdMain>> getAllRcmd() throws Exception {
		List<RcmdMain> list = rcmdService.getAllRcmd(); 
		return new ResponseEntity<List<RcmdMain>>(list, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<RcmdMain> insertRcmd(@RequestBody RcmdMain rcmd) throws Exception{
		rcmdService.insertRcmd(rcmd);
		return new ResponseEntity<RcmdMain>(HttpStatus.OK);
	}
}
