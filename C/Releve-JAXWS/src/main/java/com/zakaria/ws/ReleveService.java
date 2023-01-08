package com.zakaria.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "ReleveWS")
public class ReleveService {

    @WebMethod
    public Releve getReleve(@WebParam(name = "RIB") Long RIB) {
        Operation p1 = new Operation("2023-01-02", 2222.22,Type.CREDIT,"verment");
        Operation p2 = new Operation("2023-01-03", 159.22,Type.DEBIT,"verment");

        Operations ops = new Operations();
        ops.setDateDebut("2023-01-01");
        ops.setDateFin("2023-01-30");
        ops.getOperation().add(p1);
        ops.getOperation().add(p2);
        return new Releve(RIB,"2023-02-04",2500.00,ops);
    }
}
