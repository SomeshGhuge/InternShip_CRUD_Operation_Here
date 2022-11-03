package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientRepository clientrepository;

	@Override
	public List<Client> getListByClient(String solution) {
        List<Client> client = clientrepository.findBySolution(solution);
        return client;
	}

	@Override
	public void deletClient(Integer id) {
		clientrepository.deleteById(id);
		
	}

	@Override
	public Client saveClient(Client client) {
		return clientrepository.save(client);
	}

	

}
