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

import br.com.wtag.handmade.model.entities.Mensagens;
import br.com.wtag.handmade.model.repositories.MensagensRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/mensagens")
public class MensagensController {
 
	@Autowired
	private MensagensRepository mensagensRepository;
	
	@PostMapping
	public Mensagens create(@RequestBody Mensagens mensagens) {
		return mensagensRepository.save(mensagens);
	}
	
	@GetMapping
	public List<Mensagens> read() {
		return mensagensRepository.findAll();
	}
	
	@PutMapping
	public Mensagens update(@RequestBody Mensagens mensagens) {
		return mensagensRepository.save(mensagens);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		mensagensRepository.deleteById(id);
	}
	
}