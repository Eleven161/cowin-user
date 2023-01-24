package com.microservice.cowin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.microservice.cowin.entity.CowinUser;

public interface CowinUserRepository extends JpaRepository<CowinUser, Integer>{

	List<CowinUser> findByVaccineCenterId(int vaccineCenterId);

	CowinUser findByAdhaarNumber(String adhaarNumber);
}
