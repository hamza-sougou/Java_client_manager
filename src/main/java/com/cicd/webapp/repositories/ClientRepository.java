package com.cicd.webapp.repositories;

import com.cicd.webapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findByEmail(String email);
}
