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

import br.com.wtag.handmade.model.entities.Chats;
import br.com.wtag.handmade.model.repositories.ChatsRepository;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@RestController
@RequestMapping("/chats")
public class ChatsController {
 
	@Autowired
	private ChatsRepository chatsRepository;
	
	@PostMapping
	public Chats create(@RequestBody Chats chats) {
		return chatsRepository.save(chats);
	}
	
	@GetMapping
	public List<Chats> read() {
		return chatsRepository.findAll();
	}
	
	@PutMapping
	public Chats update(@RequestBody Chats chats) {
		return chatsRepository.save(chats);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		chatsRepository.deleteById(id);
	}
	
}