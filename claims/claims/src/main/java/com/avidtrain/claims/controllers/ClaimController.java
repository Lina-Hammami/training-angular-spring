package com.avidtrain.claims.controllers;

import com.avidtrain.claims.models.Claim;
import com.avidtrain.claims.services.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.List;

@RequestMapping("/claims")
@RestController
public class ClaimController {
    @Autowired
    private ClaimService claimService;

    @GetMapping("/list")
    public List<Claim> getClaimsList(){
        return claimService.getClaims();
    }
    @GetMapping("/{id}")
    public Claim getClaim(@PathVariable("id") int claimId){
        return claimService.getClaimById(claimId);
    }
    @PostMapping("/add/{id}")
    public void addClaim(Claim c)  {
        claimService.saveClaim();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteClaim() {
        claimService.removeClaim();
    }
}
