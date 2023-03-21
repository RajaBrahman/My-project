package com.Raja.Spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Raja.Spring.Model.CarParking;

public interface CarParkingRepository extends JpaRepository<CarParking, Long>
{

}

