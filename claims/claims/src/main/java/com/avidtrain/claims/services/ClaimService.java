package com.avidtrain.claims.services;

import com.avidtrain.claims.models.Claim;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ClaimService {
    static private ArrayList<Claim> claimDummyList = new ArrayList<>(Arrays.asList(
            new Claim("abcd", "abcd", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcde", "abcde", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcdef", "abcdef", Claim.Status.OPEN, new Date(),  new Date()),
            new Claim("abcdefg", "abcdefg", Claim.Status.OPEN, new Date(),  new Date())
    ));
    public List<Claim> getClaims(){
        return claimDummyList;
    }
    public Claim getClaimById(int id) {
        return claimDummyList.get(id);
    }
    public void saveClaim(){
    }
    public void removeClaim(){
    }
}
