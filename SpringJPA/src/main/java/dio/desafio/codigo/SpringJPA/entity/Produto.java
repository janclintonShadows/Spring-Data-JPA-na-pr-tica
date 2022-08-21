package dio.desafio.codigo.SpringJPA.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Produto {
	private int idProduto;
	private String nomeProduto;
	private String tipo;
	private double preço;
	private int qtdEstoque;
	private List<Pedido> pedido = new ArrayList<>();
}
