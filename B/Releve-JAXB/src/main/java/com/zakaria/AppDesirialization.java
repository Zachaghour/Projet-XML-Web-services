package com.zakaria;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class AppDesirialization {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("-----------------Releve------------------");
        System.out.println(releve.toString());
        System.out.println("----------------Operations-------------------");
        System.out.println(releve.getOperations().toString());
        System.out.println("---------------- LIst Operations-------------------");
        for (Operation op: releve.getOperations().getOperation()) {
            System.out.println("--------------------");
            System.out.println( op.toString());


        }
    }
}
