package com.alelucio.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alelucio.model.Categoria;
import com.alelucio.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource {
	
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
}
