package com.avidtrain.claims.models;

import java.util.Date;

public class Claim {
    enum Status{
        OPEN,
        EXPERTISE,
        CLOSED
    };
    private String claimId;
    private String claimNb;
    private Status status;
    private Date accidentDate;
    private Date creationDate;

    public String getClaimId() {
        return claimId;
    }

    public Claim() {
    }

    public Claim(String claimId, String claimNb, Status status, Date accidentDate, Date creationDate) {
        this.claimId = claimId;
        this.claimNb = claimNb;
        this.status = status;
        this.accidentDate = accidentDate;
        this.creationDate = creationDate;
    }

    public void setClaimId(String claimId) {
        this.claimId = claimId;
    }

    public String getClaimNb() {
        return claimNb;
    }

    public void setClaimNb(String claimNb) {
        this.claimNb = claimNb;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


}
