package com.chetan.hackathon.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Fav")
public class Fav {
    @Id
    private String id;
    private String busname;
    private Date Time;
    public Fav(String id, String busname, Date time) {
        this.id = id;
        this.busname = busname;
        Time = time;
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
    public Date getTime() {
        return Time;
    }
    public void setTime(Date time) {
        Time = time;
    }

}
