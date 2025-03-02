package com.robledocastro.cursomc1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.robledocastro.cursomc1.domain.Categoria;
import com.robledocastro.cursomc1.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = ((CrudRepository<Categoria, Integer>) repo).findById(id);
		return obj.orElse(null);
	}
}
