package com.microservice.cowin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name="cowin_users")
public class CowinUser {
     @Id
	private String adhaarNumber;
     @Column
	private String name;
     @Column
	private String address;
     @Column
	private int vaccineCenterId;
}
