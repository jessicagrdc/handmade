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

import br.com.wtag.handmade.model.entities.Comentarios;
import br.com.wtag.handmade.model.repositories.ComentariosRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/comentarios")
public class ComentariosController {

	@Autowired
	private ComentariosRepository comentariosRepository;
	
	@PostMapping
	public Comentarios create(@RequestBody Comentarios comentarios) {
		return comentariosRepository.save(comentarios);
	}	
	
	@GetMapping
	public List<Comentarios> read() {
		return comentariosRepository.findAll();
	}	
	
	@PutMapping
	public Comentarios update(@RequestBody Comentarios comentarios) {
		return comentariosRepository.save(comentarios);
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		comentariosRepository.deleteById(id);
	}
	
}