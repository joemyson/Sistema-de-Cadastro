package com.joemyson.sistema_de_cadastro.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joemyson.sistema_de_cadastro.DTO.ClientDTO;
import com.joemyson.sistema_de_cadastro.entities.Client;
import com.joemyson.sistema_de_cadastro.service.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientController {
	
        @Autowired
        private ClientService clientService;
       
        @GetMapping		
        public List<ClientDTO> findAll(){
						
        	return List<ClientDTO> result = clientService.findAll();			
			 
		}
	

}
