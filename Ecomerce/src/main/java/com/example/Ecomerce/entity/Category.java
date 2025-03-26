package com.example.Ecomerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.example.Ecomerce.entity.items;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<items> productList;

    @Column(name = "created_at")
    private final LocalDateTime createdAt = LocalDateTime.now();
}