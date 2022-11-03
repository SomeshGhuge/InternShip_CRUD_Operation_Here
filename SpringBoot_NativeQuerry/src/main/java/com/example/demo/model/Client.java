package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Name;
    private String Project;
    private String Solution;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProject() {
		return Project;
	}
	public void setProject(String project) {
		Project = project;
	}
	public String getSolution() {
		return Solution;
	}
	public void setSolution(String solution) {
		Solution = solution;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", Name=" + Name + ", Project=" + Project + ", Solution=" + Solution + "]";
	}
    
    
}
