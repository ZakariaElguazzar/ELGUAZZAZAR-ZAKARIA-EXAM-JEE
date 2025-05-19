package com.example.examen_backend.DTOs;

import com.example.examen_backend.Enum.StatutCredit;

import java.util.Date;
import lombok.Data;


@Data
public class CreditProfessionnelDTO extends CreditDTO{
    private Long id;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcception;
    private double montant;
    private int duree;
    private double tauxInteret;
    private ClientDTO clientDTO;
    private String motif;
    private String raisonSociale;
}
