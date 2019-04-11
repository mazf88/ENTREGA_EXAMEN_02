package com.poli.techno.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.techno.entities.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

	public Message findById(long id);

	public List<Message> findAll();
}