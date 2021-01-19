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

import br.com.wtag.handmade.model.entities.Produtos;
import br.com.wtag.handmade.model.repositories.ProdutosRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutosController {

	@Autowired
	private ProdutosRepository produtosRepository;
	
	@PostMapping
	public Produtos create(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}
	
	@GetMapping
	public List<Produtos> read() {
		return produtosRepository.findAll();
	}	
	
	@PutMapping
	public Produtos update(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}	
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		produtosRepository.deleteById(id);
	}
	
}