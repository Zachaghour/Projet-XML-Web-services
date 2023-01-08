package com.zakaria;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Releve {
    @XmlAttribute
    private Long RIB;
    private String dateReleve;
    private double solde;

    private Operations operations;

    @Override
    public String toString() {
        return "Releve{" +
                "RIB=" + RIB +
                ", dateReleve='" + dateReleve + '\'' +
                ", solde=" + solde +
                '}';
    }
}
