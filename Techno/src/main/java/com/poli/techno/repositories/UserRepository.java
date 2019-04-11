package com.poli.techno.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.techno.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public User findById(long id);

	public List<User> findAll();
}
