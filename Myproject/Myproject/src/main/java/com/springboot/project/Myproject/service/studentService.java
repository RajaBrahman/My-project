package com.springboot.project.Myproject.service;

import java.util.List;

import com.springboot.project.Myproject.model.StudentReg;


public interface studentService {
	StudentReg saveStudents(StudentReg stu);
	List<StudentReg>getAllStudents();
		

}
