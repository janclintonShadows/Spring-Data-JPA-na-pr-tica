package entity.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

//package dio.desafio.codigo.SpringJPA.entity.form;
@Data
public class Produto {
	//Entidade Produto
	private int idProduto;
	private String nomeProduto;
	private String tipo;
	private double preço;
	private int qtdEstoque;
	private List<Pedido> pedido = new ArrayList<>();
}
