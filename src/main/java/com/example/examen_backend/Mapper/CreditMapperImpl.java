package com.example.examen_backend.Mapper;

import com.example.examen_backend.DTOs.*;
import com.example.examen_backend.Entities.*;
import org.springframework.beans.BeanUtils;

public class CreditMapperImpl implements CreditMapper {
    @Override
    public ClientDTO fromClient(Client client) {
        ClientDTO clientDTO = new ClientDTO();
        BeanUtils.copyProperties(client, clientDTO);
        return clientDTO;
    }

    @Override
    public Client fromClientDTO(ClientDTO clientDTO) {
        Client client = new Client();
        BeanUtils.copyProperties(clientDTO, client);
        return client;
    }

    @Override
    public RemboursementDTO fromRemboursement(Remboursement remboursement) {
        RemboursementDTO remboursementDTO = new RemboursementDTO();
        BeanUtils.copyProperties(remboursement, remboursementDTO);
        return remboursementDTO;
    }

    @Override
    public Remboursement fromRemboursementDTO(RemboursementDTO remboursementDTO) {
        Remboursement remboursement = new Remboursement();
        BeanUtils.copyProperties(remboursementDTO, remboursement);
        return remboursement;
    }

    @Override
    public CreditProfessionnelDTO fromCreditProfessionnel(CreditProfessionnel creditProfessionnel) {
        CreditProfessionnelDTO creditProfessionnelDTO = new CreditProfessionnelDTO();
        BeanUtils.copyProperties(creditProfessionnel, creditProfessionnelDTO);
        creditProfessionnelDTO.setClientDTO(fromClient(creditProfessionnel.getClient()));
        creditProfessionnelDTO.setType(creditProfessionnel.getClass().getSimpleName());
        return creditProfessionnelDTO;
    }

    @Override
    public CreditProfessionnel fromCreditProfessionnelDTO(CreditProfessionnelDTO creditProfessionnelDTO) {
        CreditProfessionnel creditProfessionnel = new CreditProfessionnel();
        BeanUtils.copyProperties(creditProfessionnelDTO, creditProfessionnel);
        creditProfessionnel.setClient(fromClientDTO(creditProfessionnelDTO.getClientDTO()));
        return creditProfessionnel;
    }

    @Override
    public CreditImmobilierDTO fromCreditImmobilier(CreditImmobilier creditImmobilier) {
        CreditImmobilierDTO creditImmobilierDTO = new CreditImmobilierDTO();
        BeanUtils.copyProperties(creditImmobilier, creditImmobilierDTO);
        creditImmobilierDTO.setClientDTO(fromClient(creditImmobilier.getClient()));
        creditImmobilierDTO.setType(creditImmobilier.getClass().getSimpleName());
        return creditImmobilierDTO;
    }

    @Override
    public CreditImmobilier fromCreditImmobilierDTO(CreditImmobilierDTO creditImmobilierDTO) {

        CreditImmobilier creditImmobilier = new CreditImmobilier();
        BeanUtils.copyProperties(creditImmobilierDTO, creditImmobilier);
        creditImmobilier.setClient(fromClientDTO(creditImmobilierDTO.getClientDTO()));
        return creditImmobilier;
    }

    @Override
    public CreditPersonnelDTO fromCreditPersonnel(CreditPersonnel creditPersonnel) {
        CreditPersonnelDTO creditPersonnelDTO = new CreditPersonnelDTO();
        BeanUtils.copyProperties(creditPersonnel, creditPersonnelDTO);
        creditPersonnelDTO.setClientDTO(fromClient(creditPersonnel.getClient()));
        creditPersonnelDTO.setType(creditPersonnel.getClass().getSimpleName());
        return creditPersonnelDTO;
    }

    @Override
    public CreditPersonnel fromCreditPersonnelDTO(CreditPersonnelDTO creditPersonnelDTO) {
        CreditPersonnel creditPersonnel = new CreditPersonnel();
        BeanUtils.copyProperties(creditPersonnelDTO, creditPersonnel);
        creditPersonnel.setClient(fromClientDTO(creditPersonnelDTO.getClientDTO()));
        return creditPersonnel;
    }
}
