package com.springboot.project.Myproject.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.Myproject.model.StudentReg;
import com.springboot.project.Myproject.service.studentService;


@RestController
@RequestMapping("/StudentReg")
public class StudentController {
	private studentService stuservice;
	
	
	@PostMapping()
	public ResponseEntity<StudentReg>saveStudents(@RequestBody StudentReg stu){
		return new ResponseEntity<StudentReg>(stuservice.saveStudents(stu),HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public List<StudentReg>getallStudents(){
		return stuservice.getAllStudents();
	}
		
		
	}


