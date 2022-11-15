package com.zatri.favourite.model;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.mongodb.lang.Nullable;

import org.springframework.data.annotation.Id;

//@Data//lambok
public class Route {
    @Id 
    private String _id;
    @NotBlank
    private String routeId;
    @NotBlank
    private String routeName;
    private String arrivalTime;
    private String departureTime;
    private double distance;
    @Nullable
    private double fare;
    private Stop origin;
    private Stop destination;  
    private List<Stop> stops;
   // private List<Trip> trips;
    public Route(String _id, @NotBlank String routeId, @NotBlank String routeName, String arrivalTime,
            String departureTime, double distance, double fare, Stop origin, Stop destination, List<Stop> stops) {
        this._id = _id;
        this.routeId = routeId;
        this.routeName = routeName;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.distance = distance;
        this.fare = fare;
        this.origin = origin;
        this.destination = destination;
        this.stops = stops;
    }
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getRouteId() {
        return routeId;
    }
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
    public String getRouteName() {
        return routeName;
    }
    public void setRouteName(String routeName) {
        this.routeName = routeName;
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
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getFare() {
        return fare;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    public Stop getOrigin() {
        return origin;
    }
    public void setOrigin(Stop origin) {
        this.origin = origin;
    }
    public Stop getDestination() {
        return destination;
    }
    public void setDestination(Stop destination) {
        this.destination = destination;
    }
    public List<Stop> getStops() {
        return stops;
    }
    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
    
}
