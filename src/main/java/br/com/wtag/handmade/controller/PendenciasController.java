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

import br.com.wtag.handmade.model.entities.Pendencias;
import br.com.wtag.handmade.model.repositories.PendenciasRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/pendencias")
public class PendenciasController {

	@Autowired
	private PendenciasRepository pendenciasRepository;	
	
	@PostMapping
	public Pendencias create(@RequestBody Pendencias pendencias) {
		return pendenciasRepository.save(pendencias);
	}	
	
	@GetMapping
	public List<Pendencias> read() {
		return pendenciasRepository.findAll();
	}	
	
	@PutMapping
	public Pendencias update(@RequestBody Pendencias pendencias) {
		return pendenciasRepository.save(pendencias);
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pendenciasRepository.deleteById(id);
	}
	
}