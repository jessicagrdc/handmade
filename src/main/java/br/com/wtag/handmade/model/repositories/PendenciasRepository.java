package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Pendencias;

public interface PendenciasRepository extends JpaRepository<Pendencias, Long> {

}