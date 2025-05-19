package com.example.examen_backend.Mapper;

import com.example.examen_backend.DTOs.*;
import com.example.examen_backend.Entities.*;


public interface CreditMapper {
    ClientDTO fromClient(Client client);
    Client fromClientDTO(ClientDTO clientDTO);
    RemboursementDTO fromRemboursement(Remboursement remboursement);
    Remboursement fromRemboursementDTO(RemboursementDTO remboursementDTO);
    CreditProfessionnelDTO fromCreditProfessionnel(CreditProfessionnel creditProfessionnel);
    CreditProfessionnel fromCreditProfessionnelDTO(CreditProfessionnelDTO creditProfessionnelDTO);
    CreditImmobilierDTO fromCreditImmobilier(CreditImmobilier creditImmobilier);
    CreditImmobilier fromCreditImmobilierDTO(CreditImmobilierDTO creditImmobilierDTO);
    CreditPersonnelDTO fromCreditPersonnel(CreditPersonnel creditPersonnel);
    CreditPersonnel fromCreditPersonnelDTO(CreditPersonnelDTO creditPersonnelDTO);
}
