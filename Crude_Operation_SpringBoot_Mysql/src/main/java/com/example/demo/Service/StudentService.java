package com.example.demo.Service;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	public Student getEmployeeById(Integer Id);
	void deletStudent(Integer id);
	public Student updateStudentById(Integer id, Student student);
	
	


}
