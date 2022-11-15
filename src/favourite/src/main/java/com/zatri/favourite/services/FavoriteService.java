package com.zatri.favourite.services;

import java.util.List;

import com.zatri.favourite.model.Favorite;
import com.zatri.favourite.repo.favoriteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {
    @Autowired
    private favoriteRepository favrepo;

    public List<Favorite> findAll()
    {
        return favrepo.findAll();
    }
    public Favorite findbyid(String id)
    {
        return favrepo.findById(id).get();
    }
    public Favorite saveFav(Favorite fav)
    {
        return favrepo.save(fav);
    }
    public void deleteFavById(String id)
    {
        favrepo.deleteById(id);
    }
    public List<Favorite> fetchFavList() {
        return favrepo.findAll();
    }
    public void updateFavorite(Favorite fav) {
    //    List<Favorite>currentFav = fav;
    }
   
}
