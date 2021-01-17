package br.com.wtag.handmade.handmade.model.repositories;
	
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.handmade.model.entities.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
		
}