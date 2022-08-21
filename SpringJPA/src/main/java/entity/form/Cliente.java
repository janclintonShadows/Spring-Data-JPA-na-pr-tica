package entity.form;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Cliente {
	//Nossas entidade Cliente
	private int idCliente;
	private String numReg;
	private String nome;
	private String telefone;
	private String endereco;
	private List<Pedido> pedido = new ArrayList<>();
}
