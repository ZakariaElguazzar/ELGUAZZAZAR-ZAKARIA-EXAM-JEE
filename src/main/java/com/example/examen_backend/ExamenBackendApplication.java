package com.example.examen_backend;

import com.example.examen_backend.DTOs.ClientDTO;
import com.example.examen_backend.Service.CreditService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class ExamenBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CreditService creditService) {
        return args -> {
            Stream.of("Ayoub", "Hiba", "Soukaina","Noura","Zakaria").forEach(name -> {
                ClientDTO customer = new ClientDTO();
                customer.setName(name);
                Random rand = new Random();
                int randomNum = rand.nextInt(20000);
                String[] domains = {"gmail.com", "yahoo.com", "outlook.com", "protonmail.com","hotmail.com"};
                String randomDomain = domains[rand.nextInt(domains.length)];
                String email = name.toLowerCase().replaceAll("\\s+", "") + randomNum + "@" + randomDomain;
                customer.setEmail(email);
                creditService.saveClient(customer);
            });
//            bankAccountService.listCustomers().forEach(customer -> {
//                try {
//                    bankAccountService.saveCurrentBankAccount(customer.getId(), 9000, Math.random() * 90000);
//                    bankAccountService.saveSavingBankAccount(customer.getId(), 5.5, Math.random() * 120000);
//
//                } catch (CustomerNotFoundException e) {
//                    e.printStackTrace();
//                }
//            });

//            List<BankAccountDTO> bankAccounts = bankAccountService.bankAccountList();
//            for (BankAccountDTO bankAccount:bankAccounts){
//                for (int i = 0; i <10 ; i++) {
//                    String accountId;
//                    if (bankAccount instanceof SavingAccountDTO savingAccountDTO) {
//                        accountId = savingAccountDTO.getId();
//
//                    } else {
//                        CurrentAccountDTO currentAccountDTO = (CurrentAccountDTO) bankAccount;
//                        accountId = currentAccountDTO.getId();
//                    }
//                    bankAccountService.credit(accountId,10000+Math.random()*120000);
//                    bankAccountService.debit(accountId,1000+Math.random()*9000);
//
//                }
//            }


        };
    }

}
