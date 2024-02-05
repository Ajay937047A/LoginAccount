package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Serializable>{
	
	public UserEntity findByUserEmailAndUserPWD(String userEmail, Integer userPWD);
	 

}
