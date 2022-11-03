package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Client;

public interface ClientService {
	
	public List<Client> getListByClient(String solution);
    
	public void deletClient(Integer id);

    public Client saveClient(Client client);



	

}
