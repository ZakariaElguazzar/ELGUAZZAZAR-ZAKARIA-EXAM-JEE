package com.example.examen_backend.Controller;

import com.example.examen_backend.DTOs.ClientDTO;
import com.example.examen_backend.Service.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/customers")
@CrossOrigin(allowedHeaders = "*",origins = "*",exposedHeaders = "*")
public class ClientController {
    CreditService creditService;
    @GetMapping("/clients")
    public List<ClientDTO> listClients(){
        return creditService.listClients();
    }
}
