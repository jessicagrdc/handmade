package br.com.wtag.handmade.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wtag.handmade.model.entities.Chats;

public interface ChatsRepository extends JpaRepository<Chats, Long> {
	
}