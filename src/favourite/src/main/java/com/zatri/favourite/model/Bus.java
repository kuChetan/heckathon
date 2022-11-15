package com.zatri.favourite.model;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Bus{
    @Id
    private String _id;
    @NotBlank
    @Indexed(unique = true)
    private String deviceId;
    @NotBlank
    private String name;
    private String type;
    private String vehicleNumber;
    private String contactNumber;
    private String serviceType;
    private String website;
    private String bookingSite;
    private String runningStatus;
    private float fare;
    private String departureTime;
    private String arrivalTime;
    private List<Route> routes;
//    private SeatLayout seatLayout;
   private Boolean active;
//    private BusImage busImage;
   private Boolean verified;
    
    List<Integer> daysOfService;

    public Bus(String _id, @NotBlank String deviceId, @NotBlank String name, String type, String vehicleNumber,
            String contactNumber, String serviceType, String website, String bookingSite, String runningStatus,
            float fare, String departureTime, String arrivalTime, List<Route> routes, 
            Boolean active,  Boolean verified, List<Integer> daysOfService) {
        this._id = _id;
        this.deviceId = deviceId;
        this.name = name;
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.contactNumber = contactNumber;
        this.serviceType = serviceType;
        this.website = website;
        this.bookingSite = bookingSite;
        this.runningStatus = runningStatus;
        this.fare = fare;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.routes = routes;
       // this.seatLayout = seatLayout;
        this.active = active;
       // this.busImage = busImage;
        this.verified = verified;
        this.daysOfService = daysOfService;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBookingSite() {
        return bookingSite;
    }

    public void setBookingSite(String bookingSite) {
        this.bookingSite = bookingSite;
    }

    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public float getFare() {
        return fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

   

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }


    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public List<Integer> getDaysOfService() {
        return daysOfService;
    }

    public void setDaysOfService(List<Integer> daysOfService) {
        this.daysOfService = daysOfService;
    }

        
}