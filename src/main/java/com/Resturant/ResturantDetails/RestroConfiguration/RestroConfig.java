package com.Resturant.ResturantDetails.RestroConfiguration;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Resturant.ResturantDetails.RestroEnitity.Restaurant;


@Configuration
public class RestroConfig {

	
	@Bean
	HashMap<Integer,Restaurant> getList(){
		return new HashMap<>();
		}
	
}
