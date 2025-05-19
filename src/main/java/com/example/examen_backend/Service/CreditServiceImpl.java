package com.example.examen_backend.Service;

import com.example.examen_backend.DTOs.ClientDTO;
import com.example.examen_backend.Entities.Client;
import com.example.examen_backend.Mapper.CreditMapper;
import com.example.examen_backend.Repositories.ClientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class CreditServiceImpl implements CreditService {
    private ClientRepo clientRepo;
    private CreditMapper creditMapper;
    @Override
    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = creditMapper.fromClientDTO(clientDTO);
        Client savedClient = clientRepo.save(client);
        return creditMapper.fromClient(savedClient);
    }

    @Override
    public ClientDTO getClientById(Long id) {
        return clientRepo.findById(id).map(creditMapper::fromClient).orElse(null);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepo.deleteById(id);
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO clientDTO) {
        return null;
    }

    @Override
    public List<ClientDTO> listClients() {
        return clientRepo.findAll().stream().map(creditMapper::fromClient).toList();
    }
}
