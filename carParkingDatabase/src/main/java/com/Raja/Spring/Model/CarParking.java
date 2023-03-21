package com.Raja.Spring.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarParking {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tokenNo;
	private String carNo;
	private String ownerName;
	
	public CarParking() {
	
	}
	public CarParking(String carNo, String ownerName) {
		this.carNo=carNo;
		this.ownerName=ownerName;
	}
	
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	

}
