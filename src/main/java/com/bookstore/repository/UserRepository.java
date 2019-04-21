package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	User findByUsername(String username);
	User findByEmail(String userEmail);
}
