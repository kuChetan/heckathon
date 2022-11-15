package com.zatri.favourite.controller;

import java.util.List;

import javax.validation.Valid;

import com.zatri.favourite.model.Favorite;
import com.zatri.favourite.services.FavoriteService;

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
public class FavoriteController {
    @Autowired
    private FavoriteService favserv;
   
    //read
    @GetMapping("/getFavorite")
    public List<Favorite> fetchFavList()
    {
        return favserv.fetchFavList();
    }
     //Save
     @PostMapping("/addfavorite")
     public Favorite saveFav(@Valid @RequestBody Favorite fev)
     {
         return favserv.saveFav(fev);
     }
    //delete
    @DeleteMapping("/Unfavorite")
    public String deleteFavById(@PathVariable("id")String id)
    {
        favserv.deleteFavById(id);
        return "This Item Has Been Removed From Your Favorite List";
    }
    // update
    @PutMapping("/updateFavorite")
    public Favorite updateFavorite( @RequestBody Favorite fav)
    {
        favserv.updateFavorite(fav);
        return fav;
    }
    
}
