package com.example.examen_backend.Repositories;

import com.example.examen_backend.Entities.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepo  extends JpaRepository<Credit, Long> {
}
