package com.zatri.favourite.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data
@Document(collection = "Fav")
public class Favorite {
    @Id
    private String id;
    private List<Bus> buses;
    private List<Stop> stops;
     private List<Route> routes;
    public Favorite(String id, List<Bus> buses, List<Stop> stops, List<Route> routes) {
        this.id = id;
        this.buses = buses;
        this.stops = stops;
        this.routes = routes;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Bus> getBuses() {
        return buses;
    }
    public void setBuses(List<Bus> buses) {
        this.buses = buses;
    }
    public List<Stop> getStops() {
        return stops;
    }
    public void setStops(List<Stop> stops) {
        this.stops = stops;
    }
    public List<Route> getRoutes() {
        return routes;
    }
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }
            
}
