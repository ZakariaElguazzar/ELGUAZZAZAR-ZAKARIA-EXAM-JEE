package com.example.examen_backend.DTOs;
import com.example.examen_backend.Enum.TypeRemboursement;

import java.util.Date;
import lombok.Data;


@Data
public class RemboursementDTO {
    private String id;
    private Date date;
    private double montant;
    private TypeRemboursement type;
}
