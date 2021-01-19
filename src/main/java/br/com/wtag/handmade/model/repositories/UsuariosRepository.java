package br.com.wtag.handmade.model.repositories;
	
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	
	public List<Usuarios> findByUsuario(String usuario);
	
	public List<Usuarios> findByEmail(String email);
	
	public List<Usuarios> findByUsuarioAndEmail(String usuario, String email);
	
	public List<Usuarios> findByEmailAndSenha(String email, String senha);
		
}