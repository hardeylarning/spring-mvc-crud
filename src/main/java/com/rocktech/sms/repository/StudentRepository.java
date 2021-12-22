package com.rocktech.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rocktech.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
