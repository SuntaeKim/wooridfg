package com.wooridfg.api.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
  public ResponseEntity<List<EmpInfo>> getByEmpnm(@PathVariable("empnm") String empNm) throws Exception {
	  List<EmpInfo> emps = empService.getByEmpnm(empNm); 
    return new ResponseEntity<List<EmpInfo>>(emps, HttpStatus.OK);
  }
  
//  @RequestMapping(value = "/login", method=RequestMethod.GET)
//  public String valLogin(
//		  HttpServletRequest request,
//		  @RequestParam(value="empno") String empno,
//		  @RequestParam(value="empnm") String empnm) throws Exception {
//	    
//	  return empService.validationLogin(
//			  Integer.parseInt(request.getParameter("empno")),
//			  request.getParameter("empnm"));
//  }
  
  @RequestMapping(value = "/login")
  public ResponseEntity<String> valLogin(
		  @RequestParam("empno") String empno,
		  @RequestParam("empnm") String empnm) throws Exception {
	    
	  String val = empService.validationLogin(Integer.parseInt(empno), empnm); 
	  return new ResponseEntity<String>(val, HttpStatus.OK);
  }
}
