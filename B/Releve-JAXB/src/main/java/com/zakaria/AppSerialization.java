package com.zakaria;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppSerialization {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);

        List<Operation> list = new ArrayList<>();
        list.add(new Operation(
                LocalDate.of(2022,12,05).toString(),
                2500.00,
                Type.CREDIT,
                "Gift ..")
        );
        list.add(new Operation(
                LocalDate.of(2022,12,07).toString(),
                2500.00,
                Type.DEBIT,
                "save ..")
        );
        list.add(new Operation(
                LocalDate.of(2022,12,15).toString(),
                23000.00
                , Type.DEBIT,
                "save ." +
                "."));
        list.add(new Operation(
                LocalDate.of(2022,12,25).toString(),
                10000.00
                , Type.CREDIT,
                "Gift " +
                ".."));

        Operations operations = new Operations(
                LocalDate.of(2022,12,01).toString(),
                LocalDate.of(2022,12,31).toString(),
                list);
        Releve releve = new Releve(
                (long) (Math.random() * 100000000000000L),
                LocalDate.of(2023,01,02).toString(),
                23000.00,
                operations
        );

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("Releve.xml"));
    }
}
