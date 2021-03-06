package com.bookstore.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
	
	User findByEmail(String email);
	Optional<User> findById(Long id);
}
