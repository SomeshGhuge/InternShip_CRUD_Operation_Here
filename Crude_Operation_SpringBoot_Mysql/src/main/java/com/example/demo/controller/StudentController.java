package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.StudentService;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/Save")
	public ResponseEntity<Student>saveStudent(@RequestBody Student student){
		Student std=studentservice.saveStudent(student);
		return ResponseEntity.ok().body(std);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id) {
		Student student = studentservice.getEmployeeById(id);
		return ResponseEntity.ok().body(student);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Student>updateStudentById(@PathVariable("id")Integer id,@RequestBody Student student){
		Student UpdateStudentById=studentservice.updateStudentById(id,student);
		return ResponseEntity.ok().body(UpdateStudentById);
		
	}  
	
	@DeleteMapping("/delete/{id}")
			public void deleteStudentById(@PathVariable("id")Integer id)throws Exception{
		studentservice.deletStudent(id);
	}
}
