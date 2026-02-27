package com.joemyson.sistema_de_cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemyson.sistema_de_cadastro.entities.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {

}
