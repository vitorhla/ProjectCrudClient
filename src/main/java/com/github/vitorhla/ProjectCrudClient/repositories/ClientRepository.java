package com.github.vitorhla.ProjectCrudClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.vitorhla.ProjectCrudClient.entities.Client;

public interface ClientRepository  extends JpaRepository <Client, Long>{

}
