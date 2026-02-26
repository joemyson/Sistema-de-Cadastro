package com.joemyson.sistema_de_cadastro.entities;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name="tb_client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String nameClient;
    @Email
	private String email;
	
	@Column(name="dataCadastro")
	private LocalDate registrationDate;
	
	
	
	
	public Client() {
		
	}




	public Client(Long id, String nameClient, String email, LocalDate registrationDate) {
	
		this.id = id;
		this.nameClient = nameClient;
		this.email = email;
		this.registrationDate = registrationDate;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNameClient() {
		return nameClient;
	}




	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public LocalDate getRegistrationDate() {
		return registrationDate;
	}




	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}




	@Override
	public int hashCode() {
		return Objects.hash(id);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
	
