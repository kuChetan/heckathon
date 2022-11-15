package com.chetan.hackathon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Trip")
public class Trip {
    @Id
    private String routid;
    private String tripno;
    public Trip(String routid, String tripno) {
        this.routid = routid;
        this.tripno = tripno;
    }
    public String getRoutid() {
        return routid;
    }
    public void setRoutid(String routid) {
        this.routid = routid;
    }
    public String getTripno() {
        return tripno;
    }
    public void setTripno(String tripno) {
        this.tripno = tripno;
    }
}
