package com.avidtrain.claims.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    @RequestMapping("/claims")
    public String[] getClaimsList(){
        return new String[] {"claim1","claim2"};
    }

}
