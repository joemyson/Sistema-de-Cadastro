package com.joemyson.sistema_de_cadastro.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nomeProduto")
	private String nameProduct;
	
	@Column(name="descricao",columnDefinition = "TEXT")	
	private String description;
	@Column(name="valor")
	private Double value;
	@Column(name="quantidade")
	private Integer amount;
	@Column(name="dataDeCadastro")
	private Integer registrationDateProduct;
	
	
	public Product() {
		
	}


	public Product(Long id, String nameProduct, String description, Double value, Integer amount,
			Integer registrationDateProduct) {
		
		this.id = id;
		this.nameProduct = nameProduct;
		this.description = description;
		this.value = value;
		this.amount = amount;
		this.registrationDateProduct = registrationDateProduct;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNameProduct() {
		return nameProduct;
	}


	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Double getValue() {
		return value;
	}


	public void setValue(Double value) {
		this.value = value;
	}


	public Integer getAmount() {
		return amount;
	}


	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public Integer getRegistrationDateProduct() {
		return registrationDateProduct;
	}


	public void setRegistrationDateProduct(Integer registrationDateProduct) {
		this.registrationDateProduct = registrationDateProduct;
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
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
