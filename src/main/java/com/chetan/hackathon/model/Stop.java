package com.chetan.hackathon.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Stop")
public class Stop {
    @Id
    private int id;
    private String stopname;
    private Date arrivalTime;
    private Date departureTime;
    private int haltduration;
    private int stopsequence;

    public Stop(int id, String stopname, Date arrivalTime, Date departureTime, int haltduration, int stopsequence) {
        this.id = id;
        this.stopname = stopname;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.haltduration = haltduration;
        this.stopsequence = stopsequence;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStopname() {
        return stopname;
    }

    public void setStopname(String stopname) {
        this.stopname = stopname;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public int getHaltduration() {
        return haltduration;
    }

    public void setHaltduration(int haltduration) {
        this.haltduration = haltduration;
    }

    public int getStopsequence() {
        return stopsequence;
    }

    public void setStopsequence(int stopsequence) {
        this.stopsequence = stopsequence;
    }

}
