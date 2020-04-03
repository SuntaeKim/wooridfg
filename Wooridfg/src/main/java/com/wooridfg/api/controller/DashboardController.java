package com.wooridfg.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wooridfg.api.dto.Dashboard;
import com.wooridfg.api.dto.RgsMain;
import com.wooridfg.api.service.DashboardService;

@CrossOrigin("*")
@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	@Autowired
	DashboardService dbService;
	
	@RequestMapping
	public ResponseEntity<List<Dashboard>> getAllRgs() throws Exception {
		List<Dashboard> list = dbService.getDashboard();
		
		return new ResponseEntity<List<Dashboard>>(list, HttpStatus.OK);
	}
}
