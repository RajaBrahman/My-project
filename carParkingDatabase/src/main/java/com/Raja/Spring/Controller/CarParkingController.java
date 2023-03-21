package com.Raja.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Raja.Spring.Model.CarParking;
import com.Raja.Spring.Repository.CarParkingRepository;


@RestController
@RequestMapping("/car")
public class CarParkingController {
	@Autowired
	CarParkingRepository carParkingRepository;
	
	@GetMapping("/display")
	public List<CarParking>getAllCar(){
			return this.carParkingRepository.findAll();
	}
	

}
