package com.zakaria.ws;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Operations {
    private String dateDebut;
    private String dateFin;
    private List<Operation> operation = new ArrayList<>();

}
