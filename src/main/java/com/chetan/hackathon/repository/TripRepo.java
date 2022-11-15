package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.Trip;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TripRepo extends MongoRepository<Trip, String> {
    
}
