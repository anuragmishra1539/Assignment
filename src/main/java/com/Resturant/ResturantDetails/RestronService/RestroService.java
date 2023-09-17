package com.Resturant.ResturantDetails.RestronService;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Resturant.ResturantDetails.RestroEnitity.Restaurant;
import com.Resturant.ResturantDetails.RestroEnitity.Restaurant.SpecialityList;
import com.Resturant.ResturantDetails.RestroRepo.RestronController.RestroRepository;


@Service
public class RestroService {

	@Autowired
	RestroRepository restroRepository;
	
	public String AddToDB(Restaurant restaurant) {
		restroRepository.restroList().put(restaurant.getNumber(), restaurant);
		return "added";
		
	}
	public HashMap<Integer, Restaurant> getList (){
		return restroRepository.restroList();
	}
	public String addList(List<Restaurant> restaurants) {
		for(Restaurant restaurant:restaurants) {
			getList().put(restaurant.getNumber(), restaurant);
		}
		return "addedList";
	}
	public Restaurant getByid(Integer ID) {
		for(Integer id:restroRepository.restroList().keySet()) {
			if (id.equals(ID)){
				return restroRepository.restroList().get(id);
				}
		}
		 return null;
	}
	public String delete (Integer id){
		for(Integer inputid:getList().keySet()) {
			if (id.equals(inputid)){
				 restroRepository.restroList().remove(inputid);
				 return "deleted";
				}
		}
		return "object not found";
	}
    public String modifySpeciality(Integer id,SpecialityList specialityList) {
    	getByid(id).setSpecialty(specialityList);
    return "modified Speciality";
    }
    
}
