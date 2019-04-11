package com.poli.techno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poli.techno.entities.Artist;
import com.poli.techno.entities.Message;
import com.poli.techno.entities.User;
import com.poli.techno.repositories.MessageRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class MessageController {

	@Autowired
	private MessageRepository messageRepositoryDAO;

	@RequestMapping("/createMessage")
	public Message save(@RequestParam long id, @RequestParam String description, @RequestParam User idUser,
			@RequestParam Artist idArtist) {
		Message newMessage = new Message();
		newMessage.setId(id);
		newMessage.setDescription(description);
		newMessage.setUser(idUser);
		newMessage.setArtist(idArtist);
		return messageRepositoryDAO.save(newMessage);
	}

	@GetMapping("/getMessages")
	public List<Message> findAll() {
		return messageRepositoryDAO.findAll();
	}

}
