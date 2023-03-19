package com.avidtrain.claims.services;

import com.avidtrain.claims.models.Claim;
import com.avidtrain.claims.repositories.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private final ClaimRepository claimRepository;

    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public List<Claim> getClaims(){
        return claimRepository.findAll();
    }
//    public Claim getClaimById(int id) {
//        return claimDummyList.get(id);
//    }
    public void saveClaim(){
    }
    public void removeClaim(){
    }
}
