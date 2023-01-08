package com.zakaria.ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String http =  "http://0.0.0.0:9191/";
        Endpoint.publish(http, new ReleveService());
        System.out.println("Web Service deploye sur " + http);
    }
}
