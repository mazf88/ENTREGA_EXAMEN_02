package com.poli.techno.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poli.techno.entities.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

	public Artist findById(long id);

	public List<Artist> findAll();
}
