package com.zatri.favourite.model;

import javax.validation.constraints.NotBlank;

import com.mongodb.client.model.geojson.Point;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//@Data
@Document(collation = "Stop")
public class Stop {
    @Id
    private String _id;
  @NotBlank
  private String stopId;
  @NotBlank
  private String stopName;                                                                                                                                                                                                              
  private String district;
  private String stopDescription;
  private int stopSequence;
  private String type;
  private Point location;
  private String arrivalTime;
  private String departureTime;

  
public Stop(String _id, @NotBlank String stopId, @NotBlank String stopName, String district, String stopDescription,
        int stopSequence, String type, Point location, String arrivalTime, String departureTime) {
    this._id = _id;
    this.stopId = stopId;
    this.stopName = stopName;
    this.district = district;
    this.stopDescription = stopDescription;
    this.stopSequence = stopSequence;
    this.type = type;
    this.location = location;
    this.arrivalTime = arrivalTime;
    this.departureTime = departureTime;
}


public String get_id() {
    return _id;
}


public void set_id(String _id) {
    this._id = _id;
}


public String getStopId() {
    return stopId;
}


public void setStopId(String stopId) {
    this.stopId = stopId;
}


public String getStopName() {
    return stopName;
}


public void setStopName(String stopName) {
    this.stopName = stopName;
}


public String getDistrict() {
    return district;
}


public void setDistrict(String district) {
    this.district = district;
}


public String getStopDescription() {
    return stopDescription;
}


public void setStopDescription(String stopDescription) {
    this.stopDescription = stopDescription;
}


public int getStopSequence() {
    return stopSequence;
}


public void setStopSequence(int stopSequence) {
    this.stopSequence = stopSequence;
}


public String getType() {
    return type;
}


public void setType(String type) {
    this.type = type;
}


public Point getLocation() {
    return location;
}


public void setLocation(Point location) {
    this.location = location;
}


public String getArrivalTime() {
    return arrivalTime;
}


public void setArrivalTime(String arrivalTime) {
    this.arrivalTime = arrivalTime;
}


public String getDepartureTime() {
    return departureTime;
}


public void setDepartureTime(String departureTime) {
    this.departureTime = departureTime;
}
   
    }

    

  

