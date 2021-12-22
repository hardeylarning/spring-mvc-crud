package com.rocktech.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.rocktech.sms.entity.Student;
import com.rocktech.sms.service.StudentService;

@Controller
public class StudentController {
	 private StudentService sService;

	public StudentController(StudentService sService) {
		this.sService = sService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", sService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student std) {
		sService.saveStudent(std);
		return "redirect:/students";
	}
	 
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", sService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
		@ModelAttribute("student") Student student, Model model) {
		
		Student exStudent = sService.getStudentById(id);
		exStudent.setFirstName(student.getFirstName());
		exStudent.setLastName(student.getLastName());
		exStudent.setEmail(student.getEmail());
		
		sService.updateStudent(exStudent);
		
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		 sService.deleteStudentById(id);
		return "redirect:/students";
	}
	 
}
