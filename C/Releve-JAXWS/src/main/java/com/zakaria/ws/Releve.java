package com.zakaria.ws;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Releve {

    private Long RIB;
    private String dateReleve;
    private double solde;
    private Operations operations;

}
