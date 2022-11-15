package com.chetan.hackathon.repository;

import com.chetan.hackathon.model.Seat;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SeatRepo extends MongoRepository<Seat, String> {
    
}
