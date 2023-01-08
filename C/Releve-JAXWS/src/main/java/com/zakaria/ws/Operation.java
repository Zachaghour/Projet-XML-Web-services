package com.zakaria.ws;

import jakarta.xml.bind.annotation.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Operation {
    private String date;
    private double montant;
    private Type type;
    private String description;

}
