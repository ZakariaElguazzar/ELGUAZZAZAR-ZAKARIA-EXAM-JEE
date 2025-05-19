package com.example.examen_backend.Repositories;

import com.example.examen_backend.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<Client, Long> {
    @Query("SELECT c FROM Client c WHERE c.name LIKE %:kw% OR c.email LIKE %:kw% OR c.id = :kw")
    List<Client> search(@Param("kw") String keyword);
}
