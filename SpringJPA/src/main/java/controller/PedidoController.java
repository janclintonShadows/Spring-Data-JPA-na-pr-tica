package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.desafio.codigo.SpringJPA.entity.Pedido;
import dio.desafio.codigo.SpringJPA.entity.form.PedidoForm;
import dio.desafio.codigo.SpringJPA.service.impl.PedidoServiceImpl;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoServiceImpl service;
	
	@PostMapping
	public Pedido create(PedidoForm form) {
		return service.create(form);
	}
	
	@GetMapping
	public List<Pedido> getall() {
		return service.getall();
	}
}
