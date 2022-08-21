package dio.desafio.codigo.SpringJPA.entity.form;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoForm {

	@NotEmpty(message= "Preencha o campo correctamente")
	private String nomeProduto;
	
	@NotEmpty(message= "Preencha o campo correctamente")
	private String tipo;
	
	@NotEmpty(message= "Preencha o campo correctamente")
	private double preço;
	
	
	private int qtdEstoque;
}
