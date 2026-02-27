package com.joemyson.sistema_de_cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joemyson.sistema_de_cadastro.entities.Client;

public interface ClientRepositories extends JpaRepository<Client, Long> {

} 
