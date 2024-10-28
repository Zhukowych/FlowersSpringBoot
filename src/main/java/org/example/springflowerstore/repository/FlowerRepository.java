package org.example.springflowerstore.repository;


import org.example.springflowerstore.flower.Flower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long> {
}
