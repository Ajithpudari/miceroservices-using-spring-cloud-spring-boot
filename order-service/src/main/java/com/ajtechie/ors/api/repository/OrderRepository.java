package com.ajtechie.ors.api.repository;

import com.ajtechie.ors.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
