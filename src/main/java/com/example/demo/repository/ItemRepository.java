package com.example.demo.repository;

import com.example.demo.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Integer> {
}
