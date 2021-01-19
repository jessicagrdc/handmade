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

import br.com.wtag.handmade.model.entities.Amizades;
import br.com.wtag.handmade.model.repositories.AmizadesRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/amizades")
public class AmizadesController {
	
	@Autowired
	private AmizadesRepository amizadesRepository;
	
	@PostMapping
	public Amizades create(@RequestBody Amizades amizades) {
		return amizadesRepository.save(amizades);
	}
	
	@GetMapping
	public List<Amizades> read() {
		return amizadesRepository.findAll();
	}
	
	@PutMapping
	public Amizades Update(@RequestBody Amizades amizades) {
		return amizadesRepository.save(amizades);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		amizadesRepository.deleteById(id);
	}
	
}