/*
Author: Shubham Samarth
Date: February 18, 2024
Description: This interface extends JpaRepository to provide CRUD (Create, Read, Update, Delete) operations for the OrderItem entity in the FarmBazaar application. It allows interaction with the underlying database table representing order items.
*/
package com.farmbazaar.model.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmbazaar.model.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}