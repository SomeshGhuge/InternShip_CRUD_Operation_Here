package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Serializable> {

	@Query(value="select * from client client where solution=?1", nativeQuery =true)
	List<Client> findBySolution(String solution);




}



