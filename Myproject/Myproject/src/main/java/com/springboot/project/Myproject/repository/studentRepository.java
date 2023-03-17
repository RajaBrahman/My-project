package com.springboot.project.Myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.Myproject.model.StudentReg;

public interface studentRepository extends JpaRepository<StudentReg,Long> {

}
