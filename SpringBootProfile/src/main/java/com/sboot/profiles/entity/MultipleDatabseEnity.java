package com.sboot.profiles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MultipleDatabseEnity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name = "candidate_mob")
	int mobnumber;

	@Column(name = "candidate_name")
	String name;

	public MultipleDatabseEnity() {
	}

	public MultipleDatabseEnity(int mobnumber, String name) {
		super();
		this.mobnumber = mobnumber;
		this.name = name;
	}

	public int getMobnumber() {
		return mobnumber;
	}

	public void setMobnumber(int mobnumber) {
		this.mobnumber = mobnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
