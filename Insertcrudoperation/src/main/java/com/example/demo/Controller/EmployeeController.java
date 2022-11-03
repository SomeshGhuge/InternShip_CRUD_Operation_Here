package com.example.demo.Controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
    @PostMapping("/save")

	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee){
		Employee emp=employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}

}
