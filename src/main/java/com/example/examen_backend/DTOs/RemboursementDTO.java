package com.example.examen_backend.DTOs;
import com.example.examen_backend.Enum.TypeRemboursement;

import java.util.Date;

public class RemboursementDTO {
    private Long id;
    private Date date;
    private double montant;
    private TypeRemboursement type;
}
