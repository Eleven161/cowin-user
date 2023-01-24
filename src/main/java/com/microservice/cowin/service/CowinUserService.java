package com.microservice.cowin.service;

import java.util.List;

import com.microservice.cowin.entity.CowinUser;

public interface CowinUserService {
//get all users
	List<CowinUser> getUsers();
	//get user by id
	CowinUser getSingleUser(String adhaarNumer);
	//get users by vaccineCenterId
	List<CowinUser> getUsersByVaccineCenter(int vaccinecenterid);
	//create user
	
	CowinUser createUser(CowinUser user);
}
