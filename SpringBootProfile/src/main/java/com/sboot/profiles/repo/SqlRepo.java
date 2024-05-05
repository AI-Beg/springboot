package com.sboot.profiles.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sboot.profiles.entity.MultipleDatabseEnity;

public interface SqlRepo extends JpaRepository<MultipleDatabseEnity, Integer> {

}
