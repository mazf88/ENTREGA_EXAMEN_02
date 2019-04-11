package com.poli.techno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poli.techno.entities.User;
import com.poli.techno.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepositoryDAO;

	@RequestMapping("/createUser")
	public User save(@RequestParam long id, @RequestParam String name, @RequestParam String lastname,
			@RequestParam String nick, @RequestParam String password) {
		User newUser = new User();
		newUser.setId(id);
		newUser.setName(name);
		newUser.setLastname(lastname);
		newUser.setNick(nick);
		newUser.setPassword(password);
		return userRepositoryDAO.save(newUser);
	}

	@RequestMapping("/login")
	public boolean login(@RequestParam String nick, @RequestParam String password) {
		boolean validate = false;
		for (int i = 0; i < count(); i++) {
			if (userRepositoryDAO.findAll().get(i).getNick().equals(nick)
					&& userRepositoryDAO.findAll().get(i).getPassword().equals(password)) {
				validate = true;
				break;
			} else {
				validate = false;
			}
		}
		return validate;
	}

	@GetMapping("/getUsers")
	public List<User> findAll() {
		return userRepositoryDAO.findAll();
	}

	@GetMapping("/userCount")
	public long count() {
		return userRepositoryDAO.findAll().size();
	}
}
