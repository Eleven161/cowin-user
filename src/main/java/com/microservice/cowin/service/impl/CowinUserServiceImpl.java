package com.microservice.cowin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.cowin.entity.CowinUser;
import com.microservice.cowin.repository.CowinUserRepository;
import com.microservice.cowin.service.CowinUserService;

@Service
public class CowinUserServiceImpl implements CowinUserService{
	@Autowired
	private CowinUserRepository cowinUserRepo;

	@Override
	public List<CowinUser> getUsers() {
		
		return cowinUserRepo.findAll();
	}

	@Override
	public CowinUser getSingleUser(String adhaarNumber) {

		return cowinUserRepo.findByAdhaarNumber(adhaarNumber);
	}

	@Override
	public List<CowinUser> getUsersByVaccineCenter(int vaccinecenterid) {
		return cowinUserRepo.findByVaccineCenterId(vaccinecenterid);
	}

	@Override
	public CowinUser createUser(CowinUser user) {
		return cowinUserRepo.save(user);
	}

}
