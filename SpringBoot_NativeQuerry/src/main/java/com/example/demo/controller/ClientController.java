package com.example.demo.controller;

import java.util.List;

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

import com.example.demo.model.Client;

import com.example.demo.service.ClientService;

@RestController
@RequestMapping("/Client")
public class ClientController {
	
	//inject the client service here
	@Autowired
	private ClientService clientservice;
	
	@PostMapping("/Save")
	public ResponseEntity<Client>saveStudent(@RequestBody Client client){
		Client std=clientservice.saveClient(client);
		return ResponseEntity.ok().body(std);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteClientById(@PathVariable("id")Integer id)throws Exception{
    clientservice.deletClient(id);
    }
	
	
	@GetMapping("/getSolution/{Solution}")
	public ResponseEntity<List<Client>> getClientSolution(@PathVariable("Solution") String Solution) {
		List<Client> client = clientservice.getListByClient(Solution);
		return ResponseEntity.ok().body(client);
	}

}
