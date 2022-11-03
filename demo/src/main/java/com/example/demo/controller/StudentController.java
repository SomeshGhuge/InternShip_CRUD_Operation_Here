package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@GetMapping("/getdata")
	public String getTest() {

		return "student data for sssssssystem";
	}

	@GetMapping("/getlist")
	public List<String> getStudentData() {
		List<String> list = new ArrayList<String>();
		list.add("ram");
		list.add("10");
		list.add("pune");
		return list;
	}
	
	@GetMapping("/getStudent")
	public Student getStudentDetails() {
		Student student= new Student();
		return student;
	}

}
