package com.joemyson.sistema_de_cadastro.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joemyson.sistema_de_cadastro.DTO.ClientDTO;
import com.joemyson.sistema_de_cadastro.entities.Client;
import com.joemyson.sistema_de_cadastro.repositories.ClientRepositories;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepositories clientRepositoreis;
	
	public List<Client> findAll(){
		
		List<Client> result = clientRepositoreis.findAll();
		return List<ClientDTO> dto = result.stream().map(x -> new ClientDTO(x)).toList();
		
		
	}
	
	
	

}
