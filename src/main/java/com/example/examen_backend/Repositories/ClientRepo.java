package com.example.examen_backend.Repositories;

import com.example.examen_backend.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
