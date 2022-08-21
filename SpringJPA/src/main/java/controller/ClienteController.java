package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.codigo.SpringJPA.entity.Cliente;
import dio.desafio.codigo.SpringJPA.entity.Pedido;
import dio.desafio.codigo.SpringJPA.entity.form.ClienteForm;
import dio.desafio.codigo.SpringJPA.service.impl.ClienteServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("(/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl service;
	
	@PostMapping
	public Cliente create(@Valid @RequestBody ClienteForm form) {
		return service.create(form);
	}
	
	@GetMapping
	public List<Cliente> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/produtos/{id}")
	public List<Pedido> getallPedidosId(@PathVariable int id){
		return service.getallPedidosId(id);
	}
}
