package dio.desafio.codigo.SpringJPA.service;

import java.util.List;

import dio.desafio.codigo.SpringJPA.entity.Produto;
import dio.desafio.codigo.SpringJPA.entity.form.ProdutoForm;
import dio.desafio.codigo.SpringJPA.entity.form.ProdutoUpdateForm;

public interface IProdutoService {
	
	/**
	 * Cria um novo Produto
	 * @param form
	 * @return retorna o produto criado com base no formulario de pedido enviado
	 */
	public Produto create(ProdutoForm form);
	
	/**
	 * Retorna um pedido selecionado no DB com base no  seu Id.
	 * @param id
	 * @return
	 */
	public Produto get(int id);
	
	/**
	 * 
	 * @return retorna todos os produtos no db.
	 */
	public List<Produto> getAll();
	
	/**
	 * 
	 * @param id -id do produto que será atualizado
	 * @param form o formulario do produto que sera registrado
	 * @return retorna um produto
	 */
	public Produto update(int id,ProdutoUpdateForm form);
	
	/**
	 * 
	 * @param id id do produto que vai ser eliminado do DB
	 */
	public void deletar(int id);
}
