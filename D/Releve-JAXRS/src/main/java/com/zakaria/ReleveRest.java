package com.zakaria;
import com.google.gson.Gson;
import com.zakaria.proxy.Releve;
import com.zakaria.proxy.ReleveService;
import com.zakaria.proxy.ReleveWS;

import static spark.Spark.*;
public class ReleveRest {
    public static void main(String[] args) {
        ReleveService stub = new ReleveWS().getReleveServicePort();


        Gson gson = new Gson();
        System.out.println("port 4567 ");
        get("/welcome", (req, res)-> "Welcome Zakaria Achaghour" ,gson ::toJson);

        get("/releve/:rib", (req, res)-> {
                res.type("application/json");
            Releve r = stub.getReleve(Long.valueOf(req.params(":rib")));
                return r;
            }, gson ::toJson);
    }

}
