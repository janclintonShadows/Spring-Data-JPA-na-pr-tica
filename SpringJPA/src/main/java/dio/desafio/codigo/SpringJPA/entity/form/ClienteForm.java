package dio.desafio.codigo.SpringJPA.entity.form;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteForm {
	
	@NotEmpty(message = "Preencha o campo correctamente.")
	@Size(min = 3, max=50, message = "'${validateValue}' precisa estar entre {min] e {max} caracteres")
	private String nome;
	
	@NotEmpty(message= "Preencha o campo correctamente")
	private String numReg;
	
	@NotEmpty(message = "Preencha o campo correctamente.")
	@Size(min = 9, max=12, message = "'${validateValue}' precisa estar entre {min] e {max} caracteres")
	private String telefone;
	
	@NotEmpty(message = "Preencha o campo correctamente.")
	@Size(min = 3, max=50, message = "'${validateValue}' precisa estar entre {min] e {max} caracteres")
	private String endereco;
}
