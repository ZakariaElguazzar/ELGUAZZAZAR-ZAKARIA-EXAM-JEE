package com.example.examen_backend.Controller;

import com.example.examen_backend.DTOs.ClientDTO;
import com.example.examen_backend.Service.CreditService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
@CrossOrigin(allowedHeaders = "*",origins = "*",exposedHeaders = "*")
public class ClientController {
    CreditService creditService;
    @GetMapping("/list_clients")
    public List<ClientDTO> listClients(){
        return creditService.listClients();
    }
    @GetMapping("/search_customer")
    public List<ClientDTO> Search(@RequestParam(name = "keyword",defaultValue = "") String keyword){
        return creditService.searchCustomer(keyword);
    }
}
