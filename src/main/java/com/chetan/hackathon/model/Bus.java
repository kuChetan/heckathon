package com.chetan.hackathon.model;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Bus")
public class Bus{
    @Id
    private String id;
    private String busname;
    private String busroute;
    private String bustrip;
    private Date starTime;
    private Date endTime;
    private List<Stop> stops;
    public Bus() {
    }

    public Bus(String busname, String busroute, String bustrip, Date starTime, Date endTime, List<Stop> stops) {
        this.busname = busname;
        this.busroute = busroute;
        this.bustrip = bustrip;
        this.starTime = starTime;
        this.endTime = endTime;
        this.stops = stops;
    }

    public Bus(String id, String busname, String busroute, String bustrip, Date starTime, Date endTime, List<Stop> stops) {
        this.id = id;
        this.busname = busname;
        this.busroute = busroute;
        this.bustrip = bustrip;
        this.starTime = starTime;
        this.endTime = endTime;
        this.stops = stops;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBusname() {
        return busname;
    }

    public void setBusname(String busname) {
        this.busname = busname;
    }

    public String getBusroute() {
        return busroute;
    }

    public void setBusroute(String busroute) {
        this.busroute = busroute;
    }

    public String getBustrip() {
        return bustrip;
    }

    public void setBustrip(String bustrip) {
        this.bustrip = bustrip;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Stop> getStops() {
        return stops;
    }

    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
    
}