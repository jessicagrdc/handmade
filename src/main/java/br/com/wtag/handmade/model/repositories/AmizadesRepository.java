package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Amizades;

public interface AmizadesRepository extends JpaRepository<Amizades, Long> {
	
}