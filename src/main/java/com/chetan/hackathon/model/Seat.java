package com.chetan.hackathon.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Seat")
public class Seat {
    @Id
    private String seatid;
    private int seatno;
    private String category;
    private String Bookedst;
    private Stop startStop;
    private Stop endStop;
    public Seat(String seatid, int seatno, String category, String bookedst, Stop startStop, Stop endStop) {
        this.seatid = seatid;
        this.seatno = seatno;
        this.category = category;
        Bookedst = bookedst;
        this.startStop = startStop;
        this.endStop = endStop;
    }
    public String getSeatid() {
        return seatid;
    }
    public void setSeatid(String seatid) {
        this.seatid = seatid;
    }
    public int getSeatno() {
        return seatno;
    }
    public void setSeatno(int seatno) {
        this.seatno = seatno;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getBookedst() {
        return Bookedst;
    }
    public void setBookedst(String bookedst) {
        Bookedst = bookedst;
    }
    public Stop getStartStop() {
        return startStop;
    }
    public void setStartStop(Stop startStop) {
        this.startStop = startStop;
    }
    public Stop getEndStop() {
        return endStop;
    }
    public void setEndStop(Stop endStop) {
        this.endStop = endStop;
    }
}
