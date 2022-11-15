package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.Stop;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StopRepo extends MongoRepository<Stop, Integer>{
    
}
