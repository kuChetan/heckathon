package com.chetan.hackathon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Bookedst")
public class Bookedst {
    @Id
    private String id;
    private boolean booked;
    private boolean rederved;
    private boolean vacant;
    public Bookedst(boolean booked, boolean rederved, boolean vacant) {
        this.booked = booked;
        this.rederved = rederved;
        this.vacant = vacant;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isBooked() {
        return booked;
    }
    public void setBooked(boolean booked) {
        this.booked = booked;
    }
    public boolean isRederved() {
        return rederved;
    }
    public void setRederved(boolean rederved) {
        this.rederved = rederved;
    }
    public boolean isVacant() {
        return vacant;
    }
    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }
}
