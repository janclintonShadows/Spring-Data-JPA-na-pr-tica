package dio.desafio.codigo.SpringJPA.entity.form;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoForm {
	
	@NotEmpty(message= "Preencha o campo correctamente")
	private List<Integer> produtoId;
	
	@NotEmpty(message= "Preencha o campo correctamente")
	private int clienteId;
}
