package com.Resturant.ResturantDetails.RestronController;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Resturant.ResturantDetails.RestroEnitity.Restaurant;
import com.Resturant.ResturantDetails.RestroEnitity.Restaurant.SpecialityList;
import com.Resturant.ResturantDetails.RestronService.RestroService;

@RestController
public class ResturantController {
	
	@Autowired
	RestroService restroService;

   @PostMapping("/addrestaurant")
   public String addRestro(@RequestBody Restaurant restaurant) {
	   return restroService.AddToDB(restaurant);
   }
   @GetMapping("/restaurants")
   public HashMap<Integer, Restaurant> GetList(){
	   return restroService.getList();
   }
   @GetMapping("/restaurant/{id}")
   public Restaurant getbyid(@PathVariable Integer id){
	   return restroService.getByid(id);
   }
   @PutMapping("/addList")
   public String addList(@RequestBody List<Restaurant> restaurants) {
	   return restroService.addList(restaurants);
   }
   @DeleteMapping("/delete/restaurant/{id}")
   public String deletebyId(@PathVariable Integer id){
	   return restroService.delete(id);
   }
   @PutMapping("/edit/speciality/{id}/speciality/{specialityList}")
   public String addList(@RequestBody Integer id,@RequestBody SpecialityList specialityList) {
	   return restroService.modifySpeciality(id, specialityList);
   }
   
}
