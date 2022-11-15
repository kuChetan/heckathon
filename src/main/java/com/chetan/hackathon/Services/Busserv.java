package com.chetan.hackathon.Services;

import java.util.List;
import java.util.Objects;

import com.chetan.hackathon.model.Bus;
import com.chetan.hackathon.repository.BusRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Busserv{
    @Autowired
    private BusRepo busrepo;

    public List<Bus> findAll(){
        return busrepo.findAll();
    }
    public Bus findbyid(String id)
    {
        return busrepo.findById(id).get();
    }
    public Bus saveBus(Bus bus)
    {
        return busrepo.save(bus); 
    }
    public void deleteBusById(String id)
    {
        busrepo.deleteById(id);
    }
    public Bus busUpdate(String id,Bus ubus){
      Bus fbus = findbyid(id);
      if(Objects.nonNull(ubus.getBusname()) && !"".equalsIgnoreCase(ubus.getBusname()))
      {
        fbus.setBusname(ubus.getBusname());
      }
      return busrepo.save(fbus);
    }
    public List<Bus> fetchBusList() {
        return busrepo.findAll();
    }
}
