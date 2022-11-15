package com.chetan.hackathon.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "SeatLayout")
public class SeatLayout {
    @Id
    private String layoutid;
    List<Seat> seatsOnLastRow;
    List<Seat> seatsOnLeftRow;
    List<Seat> seatsOnRightRow;
    List<Seat> sleepersOnLeftRow;
    List<Seat> sleepersOnRightRow;
    private String typeOfEntrance;
    private String vehicleModel;
    public SeatLayout(String layoutid, List<Seat> seatsOnLastRow, List<Seat> seatsOnLeftRow, List<Seat> seatsOnRightRow,
            List<Seat> sleepersOnLeftRow, List<Seat> sleepersOnRightRow, String typeOfEntrance, String vehicleModel) {
        this.layoutid = layoutid;
        this.seatsOnLastRow = seatsOnLastRow;
        this.seatsOnLeftRow = seatsOnLeftRow;
        this.seatsOnRightRow = seatsOnRightRow;
        this.sleepersOnLeftRow = sleepersOnLeftRow;
        this.sleepersOnRightRow = sleepersOnRightRow;
        this.typeOfEntrance = typeOfEntrance;
        this.vehicleModel = vehicleModel;
    }
    public String getLayoutid() {
        return layoutid;
    }
    public void setLayoutid(String layoutid) {
        this.layoutid = layoutid;
    }
    public List<Seat> getSeatsOnLastRow() {
        return seatsOnLastRow;
    }
    public void setSeatsOnLastRow(List<Seat> seatsOnLastRow) {
        this.seatsOnLastRow = seatsOnLastRow;
    }
    public List<Seat> getSeatsOnLeftRow() {
        return seatsOnLeftRow;
    }
    public void setSeatsOnLeftRow(List<Seat> seatsOnLeftRow) {
        this.seatsOnLeftRow = seatsOnLeftRow;
    }
    public List<Seat> getSeatsOnRightRow() {
        return seatsOnRightRow;
    }
    public void setSeatsOnRightRow(List<Seat> seatsOnRightRow) {
        this.seatsOnRightRow = seatsOnRightRow;
    }
    public List<Seat> getSleepersOnLeftRow() {
        return sleepersOnLeftRow;
    }
    public void setSleepersOnLeftRow(List<Seat> sleepersOnLeftRow) {
        this.sleepersOnLeftRow = sleepersOnLeftRow;
    }
    public List<Seat> getSleepersOnRightRow() {
        return sleepersOnRightRow;
    }
    public void setSleepersOnRightRow(List<Seat> sleepersOnRightRow) {
        this.sleepersOnRightRow = sleepersOnRightRow;
    }
    public String getTypeOfEntrance() {
        return typeOfEntrance;
    }
    public void setTypeOfEntrance(String typeOfEntrance) {
        this.typeOfEntrance = typeOfEntrance;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }
    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }
     
}
