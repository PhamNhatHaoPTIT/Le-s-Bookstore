package com.bookstore.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.UserShipping;

public interface UserShippingRepository extends CrudRepository<UserShipping, Long> {
	
	Optional<UserShipping> findById(Long id);
	void deleteById(Long id);
}
