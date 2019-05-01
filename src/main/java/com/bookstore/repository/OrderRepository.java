package com.bookstore.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{
	Optional<Order> findById(long id);
}
