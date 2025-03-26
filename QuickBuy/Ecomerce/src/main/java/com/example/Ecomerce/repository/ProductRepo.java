package com.example.Ecomerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Ecomerce.entity.items;

import java.util.List;

public interface ProductRepo extends JpaRepository<items, Long> {
    List<items> findByCategoryId(Long categoryId);
    List<items> findByNameContainingOrDescriptionContaining(String name, String description);
}