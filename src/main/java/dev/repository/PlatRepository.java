package dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entite.Plat;

public interface PlatRepository extends JpaRepository<Plat, Integer> {

	List<String> findAllPlat(String nom);
}
