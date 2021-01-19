package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Mensagens;

public interface MensagensRepository extends JpaRepository<Mensagens, Long> {
	
}