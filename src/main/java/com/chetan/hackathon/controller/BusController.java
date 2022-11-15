package com.chetan.hackathon.controller;

import java.util.List;

import javax.validation.Valid;

import com.chetan.hackathon.Services.Busserv;
import com.chetan.hackathon.model.Bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BusController {
    @Autowired 
    private Busserv busserv;
    //save
    @PostMapping("/bus")
    public Bus saveBus(@Valid @RequestBody Bus bus)
    {
        return busserv.saveBus(bus);
    }
    //read
    @GetMapping("/bus")
    public List<Bus> fetchBusList()
    {
        return busserv.fetchBusList();
    }
    //Update
    @PutMapping("/bus/{id}")
    public Bus busUpdate(@RequestBody Bus bus, @PathVariable("id") String id)
    {
        return busserv.busUpdate(id ,bus);
    }
    //delete
    @DeleteMapping("/bus/{id}")
    public String deleteBusById(@PathVariable("id")String id)
    {
        busserv.deleteBusById(id);
        return "Delete Successfully";
    }
    
    
}
