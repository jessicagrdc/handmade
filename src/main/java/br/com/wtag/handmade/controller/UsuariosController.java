package br.com.wtag.handmade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wtag.handmade.model.entities.Usuarios;
import br.com.wtag.handmade.model.repositories.UsuariosRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@PostMapping
	public Usuarios create(@RequestBody Usuarios usuarios) {
		return usuariosRepository.save(usuarios);
	}		
	
	@PostMapping("/login")
	public List<Usuarios> login(@RequestBody Usuarios usuarios) {
		return usuariosRepository.findByEmailAndSenha(usuarios.getEmail(), usuarios.getSenha());	
	}	
	
	@GetMapping
	public List<Usuarios> read() {
		return usuariosRepository.findAll();
	}	
	
	@GetMapping("/buscar/usuario/{usuario}")
	public List<Usuarios> findByUsuario(@PathVariable("usuario") String usuario) {
		return usuariosRepository.findByUsuario(usuario);
	}	
	
	@GetMapping("/buscar/email/{email}")
	public List<Usuarios> findByEmail(@PathVariable("email") String email) {
		return usuariosRepository.findByEmail(email);
	}
	
	@GetMapping("buscar/usuario/{usuario}/email/{email}")
	public List<Usuarios> findByUsuarioAndEmail(@PathVariable("usuario") String usuario, 
			@PathVariable("email") String email) {
		return usuariosRepository.findByUsuarioAndEmail(usuario, email);	
	}
	
	@PutMapping
	public Usuarios update(@RequestBody Usuarios usuarios) {
		return usuariosRepository.save(usuarios);
	}		
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		usuariosRepository.deleteById(id);
	}
	
}