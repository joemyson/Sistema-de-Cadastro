package com.joemyson.sistema_de_cadastro.DTO;

import com.joemyson.sistema_de_cadastro.entities.Product;

public class ProductDTO {

	
	
    private Long id;	
	private String nameProduct;	
	private String description;	
	private Double value;	
	private Integer amount;
	
	
	public ProductDTO() {
		
	}


	public ProductDTO(Product entity) {
		
		id = entity.getId();
		nameProduct = entity.getNameProduct();
		description = entity.getDescription();
		value = entity.getValue();
		amount = entity.getAmount();
	}


	public Long getId() {
		return id;
	}


	public String getNameProduct() {
		return nameProduct;
	}


	public String getDescription() {
		return description;
	}


	public Double getValue() {
		return value;
	}


	public Integer getAmount() {
		return amount;
	}
	
	
	
	
	
	
}
