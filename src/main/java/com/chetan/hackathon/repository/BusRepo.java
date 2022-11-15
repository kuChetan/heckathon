package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.Bus;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BusRepo extends MongoRepository<Bus,String> {

    Bus busUpdate = null;

    static Bus busUpdate(Bus fbus) {
        return null;
    }
    
}
