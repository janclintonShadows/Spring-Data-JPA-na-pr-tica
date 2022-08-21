package dio.desafio.codigo.SpringJPA.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Pedido {
	private int idPedido;
	private Cliente cliente;
	private LocalDate dataPedido;
	private List<Produto> produto = new ArrayList<>();
}
