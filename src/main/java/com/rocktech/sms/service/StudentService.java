package com.rocktech.sms.service;

import java.util.List;

import com.rocktech.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student std);
	
	Student getStudentById(Long id);
	
	void deleteStudentById(Long id);
}
