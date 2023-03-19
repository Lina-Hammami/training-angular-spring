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

    static private ArrayList<Claim> claimDummyList = new ArrayList<>(Arrays.asList(
            new Claim("abcd", "abcd", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcde", "abcde", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcdef", "abcdef", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcdefg", "abcdefg", Claim.Status.OPEN, new Date(),  new Date())
    ));

    public ClaimService(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    public List<Claim> getClaims(){
        return claimRepository.findAll();
    }
    public Claim getClaimById(int id) {
        return claimDummyList.get(id);
    }
    public void saveClaim(){
    }
    public void removeClaim(){
    }
}
