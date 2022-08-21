package dio.desafio.codigo.SpringJPA.service;

import java.util.List;
import dio.desafio.codigo.SpringJPA.entity.Cliente;
import dio.desafio.codigo.SpringJPA.entity.Pedido;
import dio.desafio.codigo.SpringJPA.entity.form.ClienteForm;
import dio.desafio.codigo.SpringJPA.entity.form.ClienteFormUpdate;

public interface IClienteService {
	
	/**
	 * Cria um um novo cliente no banco de dados
	 * @param form
	 * @return o cliente que foi criado.
	 */
	Cliente create(ClienteForm form);
	
	/***
	 * Retorna um cliente que está no banco de dados de acordo com seu Id
	 * @param id
	 * @return
	 */
	Cliente get(int id);
	
	/**
	 * 
	 * @return uma lista de clientes que estão no DB
	 */
	List<Cliente> getAll();
	
	/**
	 * 
	 * @param id
	 * @param form
	 * @return
	 */
	Cliente update(int id,ClienteFormUpdate form);
	
	/**
	 * Deleta um Cliente especifico do DB
	 * @param id
	 */
	void delete(int id);
	
	/**
	 * 
	 * @param id do Cliente que será recuperado da lista de pedidos
	 * @return uma lista com todos os pedidos do Cliente de acordo com Id.
	 */
	List<Pedido> getallPedidosId(int id);
}
