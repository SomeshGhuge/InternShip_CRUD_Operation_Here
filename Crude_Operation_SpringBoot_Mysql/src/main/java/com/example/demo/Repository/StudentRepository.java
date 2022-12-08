package com.example.demo.Repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends  CrudRepository<Student,Serializable> {

	public Student findById(Integer Id);


}
