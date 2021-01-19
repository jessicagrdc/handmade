package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Comentarios;

public interface ComentariosRepository extends JpaRepository<Comentarios, Long> {
	
}