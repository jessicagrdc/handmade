package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	
}
