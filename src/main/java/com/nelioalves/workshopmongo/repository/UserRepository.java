package com.nelioalves.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nelioalves.workshopmongo.domain.User;

public interface UserRepository  extends MongoRepository<User, String>{

	public List<User> findAll();

}
