package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.codigo.SpringJPA.entity.Produto;
import dio.desafio.codigo.SpringJPA.entity.form.ProdutoForm;
import dio.desafio.codigo.SpringJPA.service.impl.ProdutoServiceImpl;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoServiceImpl service;
	
	@PostMapping
	public Produto create(@RequestBody ProdutoForm form) {
		return service.create(form);
	}
	
	@GetMapping
	public List<Produto> getAll(){
		return service.getAll();
	}
}
