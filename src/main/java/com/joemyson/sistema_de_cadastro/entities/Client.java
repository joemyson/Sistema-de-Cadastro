package com.joemyson.sistema_de_cadastro.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_client")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nome")
	private String name;
	
	private String email;
	
	@Column(name="dataCadastro")
	private Integer registrationDate;
	
	
	
	
	public Client() {
		
	}




	public Client(Long id, String name, String email, Integer registrationDate) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.registrationDate = registrationDate;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Integer getRegistrationDate() {
		return registrationDate;
	}




	public void setRegistrationDate(Integer registrationDate) {
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
	
