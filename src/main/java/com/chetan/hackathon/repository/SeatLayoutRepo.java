package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.SeatLayout;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SeatLayoutRepo extends MongoRepository<SeatLayout, String> {
    
}
