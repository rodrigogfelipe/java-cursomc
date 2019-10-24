package com.rodrigofelipe.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rodrigofelipe.cursomc.domain.Categoria;
import com.rodrigofelipe.cursomc.repositories.CategoriaRepository;
import com.rodrigofelipe.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	/* SE obj ID for encontrado retorna ID, SE NAO return ObjectNotFoundException */
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}
