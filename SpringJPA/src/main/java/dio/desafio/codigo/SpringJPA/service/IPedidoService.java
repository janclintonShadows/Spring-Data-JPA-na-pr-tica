package dio.desafio.codigo.SpringJPA.service;

import java.util.List;

import dio.desafio.codigo.SpringJPA.entity.Pedido;
import dio.desafio.codigo.SpringJPA.entity.form.PedidoForm;

public interface IPedidoService {
	/**
	 * Cria um novo pedidos
	 * @param form
	 * @return
	 */
	public Pedido create(PedidoForm form);
	
	/**
	 * 
	 * @param Id
	 * @return Retorna um Pedido que está no banco de dados de acordo com seu Id
	 */
	public Pedido get(int Id);
	
	/**
	 * 
	 * @return uma lista com todos os pedidos feitos
	 */
	public List<Pedido> getall();
	
	/**
	   * Deleta um pedido específico.
	   * @param id - id do Pedido que será removida.
	   */
	public void delete(int id);
	
}
