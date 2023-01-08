package com.zakaria;

import com.zakaria.proxy.Releve;
import com.zakaria.proxy.ReleveService;
import com.zakaria.proxy.ReleveWS;

public class Main {
    public static void main(String[] args) {
        ReleveService stub = new ReleveWS().getReleveServicePort();

        Releve r = stub.getReleve(Long.valueOf(12354673));
        System.out.println(r.getRIB());
    }
}