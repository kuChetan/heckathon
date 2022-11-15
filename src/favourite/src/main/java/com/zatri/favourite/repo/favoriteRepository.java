package com.zatri.favourite.repo;

import com.zatri.favourite.model.Favorite;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface favoriteRepository extends MongoRepository<Favorite, String>  {
    
}
