package com.example.examen_backend.Service;

import com.example.examen_backend.DTOs.ClientDTO;

import java.util.List;

public interface CreditService {
    ClientDTO saveClient(ClientDTO clientDTO);
    ClientDTO getClientById(Long id);
    void deleteClient(Long id);
    ClientDTO updateClient(Long id, ClientDTO clientDTO);
    List<ClientDTO> listClients();
    List<ClientDTO> searchCustomer(String keyword);
}
