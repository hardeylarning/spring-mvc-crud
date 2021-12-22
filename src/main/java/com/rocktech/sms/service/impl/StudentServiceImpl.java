package com.rocktech.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rocktech.sms.entity.Student;
import com.rocktech.sms.repository.StudentRepository;
import com.rocktech.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository repo;

	public StudentServiceImpl(StudentRepository repo) {
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

	@Override
	public Student updateStudent(Student std) {
		return repo.save(std);
	}

	@Override
	public Student getStudentById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Long id) {
		repo.deleteById(id);
		
	}
	
}
