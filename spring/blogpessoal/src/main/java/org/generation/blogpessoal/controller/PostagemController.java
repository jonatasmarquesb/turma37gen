package org.generation.blogpessoal.controller;

import java.util.List;
import java.util.Optional;

import org.generation.blogpessoal.model.Postagem;
import org.generation.blogpessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ponstagens")
@CrossOrigin("*")

public class PostagemController {
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping 
	public ResponseEntity<List<Postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll()); }
	
	@GetMapping("/porID/{id}")
	public Optional<Postagem> findById(@PathVariable("id") Long id){
		return repository.findById(id);
	}
	@GetMapping("/porTitulo/{titulo}")
	public Postagem getByTitulo(@PathVariable("titulo") String titulo){
		return repository.getByTitulo(titulo);
	}
	
	
		
	}

