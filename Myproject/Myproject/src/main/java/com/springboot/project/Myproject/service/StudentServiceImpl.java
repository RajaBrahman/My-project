package com.springboot.project.Myproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.project.Myproject.model.StudentReg;
import com.springboot.project.Myproject.repository.studentRepository;

@Service
public class StudentServiceImpl implements studentService {
	private studentRepository stRep;
	public StudentServiceImpl(studentRepository stRep) {
		super();
		this.stRep=stRep;
	}
	public StudentReg saveStudent(StudentReg stu) {
		return stRep.save(stu);
	}
	public List<StudentReg>getAllStudents(){
		return stRep.findAll();
	}
	
	}
	


