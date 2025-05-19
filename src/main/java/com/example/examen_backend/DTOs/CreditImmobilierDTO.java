package com.example.examen_backend.DTOs;

import com.example.examen_backend.Enum.StatutCredit;

import java.util.Date;

public class CreditImmobilierDTO extends CreditDTO{
    private Long id;
    private Date dateDemande;
    private StatutCredit statut;
    private Date dateAcception;
    private double montant;
    private int duree;
    private double tauxInteret;
    private ClientDTO clientDTO;
    private String typeBien;


}
