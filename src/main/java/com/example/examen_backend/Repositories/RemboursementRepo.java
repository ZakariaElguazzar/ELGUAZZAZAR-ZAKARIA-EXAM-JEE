package com.example.examen_backend.Repositories;

import com.example.examen_backend.Entities.Remboursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemboursementRepo extends JpaRepository<Remboursement, Long> {
}
