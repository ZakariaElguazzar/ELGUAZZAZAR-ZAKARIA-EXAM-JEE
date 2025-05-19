package com.example.examen_backend.Repositories;

import com.example.examen_backend.Entities.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemboursementRepo extends JpaRepository<Remboursement, Long> {
}
