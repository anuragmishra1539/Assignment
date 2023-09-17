package com.Resturant.ResturantDetails.RestroRepo.RestronController;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Resturant.ResturantDetails.RestroEnitity.Restaurant;


@Repository
public class RestroRepository {
	
	@Autowired
	HashMap<Integer, Restaurant> listResturant;

    public HashMap<Integer,Restaurant > restroList() {
    	return listResturant;
		
	}

}
