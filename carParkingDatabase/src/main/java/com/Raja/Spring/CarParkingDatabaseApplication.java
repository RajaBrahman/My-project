package com.Raja.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Raja.Spring.Model.CarParking;
import com.Raja.Spring.Repository.CarParkingRepository;

@SpringBootApplication
public class CarParkingDatabaseApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CarParkingDatabaseApplication.class, args);
	}
	@Autowired
	private CarParkingRepository carParkingRepository;
	@Override
	public void run(String... args) throws Exception{
		this.carParkingRepository.save(new CarParking("TN-21-B-8080", "Raja"));
		this.carParkingRepository.save(new CarParking("TN-19-B-8010", "Kannan"));

}
}
