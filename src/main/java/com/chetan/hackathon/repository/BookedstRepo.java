package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.Bookedst;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookedstRepo extends MongoRepository<Bookedst, String> {
    
}
