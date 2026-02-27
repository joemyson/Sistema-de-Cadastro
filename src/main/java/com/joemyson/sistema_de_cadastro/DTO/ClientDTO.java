package com.joemyson.sistema_de_cadastro.DTO;



import com.joemyson.sistema_de_cadastro.entities.Client;

public class ClientDTO {
	
	
	private Long id;	
	private String nameClient; 
	private String email;
	
	public ClientDTO() {
		
	}

	public ClientDTO(Client entity) {
		
		id = entity.getId();
		nameClient = entity.getNameClient();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public String getNameClient() {
		return nameClient;
	}

	public String getEmail() {
		return email;
	}
	
	
	
	
	
	
	

}
