package com.zakaria;

import jakarta.xml.bind.annotation.*;
import lombok.*;
import org.eclipse.persistence.oxm.annotations.XmlProperty;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Operation {
    @XmlAttribute
    private String date;
    @XmlAttribute
    private double montant;
    @XmlAttribute
    private Type type;
    @XmlAttribute
    private String description;

    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montant=" + montant +
                ", type=" + type +
                ", description='" + description + '\'' +
                '}';
    }
}
