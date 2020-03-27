package com.wooridfg.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wooridfg.api.dto.EmpInfo;
import com.wooridfg.api.service.EmpService;

@CrossOrigin("*")
@RestController
@RequestMapping("/emp")
public class EmpController {
  @Autowired
  EmpService empService;
  
  @GetMapping
  public ResponseEntity<List<EmpInfo>> getAll() throws Exception {
	  List<EmpInfo> emps = empService.getAll(); 
    return new ResponseEntity<List<EmpInfo>>(emps, HttpStatus.OK);
  }
  
  @RequestMapping(value = "/{empnm}")
  public ResponseEntity<EmpInfo> getByEmpno(@PathVariable("empnm") String empNm) throws Exception {
	  EmpInfo emp = empService.getByEmpnm(empNm); 
    return new ResponseEntity<EmpInfo>(emp, HttpStatus.OK);
  }
}
