package com.Resturant.ResturantDetails.RestroEnitity;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	public enum SpecialityList {
		Bakwas,MahaBakwas,AtiBakwas,Bakwasest;
	}

	@NotBlank
	private Integer  number; 
	@NotBlank
	@Min(value = 5)@Max(value = 20)
	private String name;
	@NotBlank
	private String restaurant_address;
	@NotBlank
	private SpecialityList specialty;
	@NotBlank 
	private Integer staffs ;
}
