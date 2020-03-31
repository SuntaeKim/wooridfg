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

import com.wooridfg.api.dto.RgsMain;
import com.wooridfg.api.service.RgsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/rgs")
public class RgsController {
	@Autowired
	RgsService RgsService;
	
	@RequestMapping
	public ResponseEntity<List<RgsMain>> getAllRgs() throws Exception {
		List<RgsMain> list = RgsService.getAllRgs(); 
		return new ResponseEntity<List<RgsMain>>(list, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<RgsMain> insertRgs(@RequestBody RgsMain Rgs) throws Exception{
		RgsService.insertRgs(Rgs);
		return new ResponseEntity<RgsMain>(HttpStatus.OK);
	}
}
