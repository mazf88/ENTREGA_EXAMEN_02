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
import com.poli.techno.repositories.ArtistRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ArtistController {

	@Autowired
	private ArtistRepository artistRepositoryDAO;

	@RequestMapping("/createArtist")
	public Artist save(@RequestParam long id, @RequestParam String name, @RequestParam String description,
			@RequestParam String category, @RequestParam String image) {
		Artist newArtist = new Artist();
		newArtist.setId(id);
		newArtist.setName(name);
		newArtist.setDescription(description);
		newArtist.setCategory(category);
		newArtist.setImage(image);
		return artistRepositoryDAO.save(newArtist);
	}

	@GetMapping("/getMessagesByArtist")
	public List<Message> getMessages(@RequestParam long id) {
		List<Message> list = null;
		for (int i = 0; i < count(); i++) {
			if (artistRepositoryDAO.findAll().get(i).getId() == id) {
				list = artistRepositoryDAO.findAll().get(i).getMessages();
			}
		}
		return list;
	}

	@GetMapping("/getArtists")
	public List<Artist> findAll() {
		return artistRepositoryDAO.findAll();
	}

	@GetMapping("/artistCount")
	public long count() {
		return artistRepositoryDAO.findAll().size();
	}

}
