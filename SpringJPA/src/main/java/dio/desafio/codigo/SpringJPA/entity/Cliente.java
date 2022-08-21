package dio.desafio.codigo.SpringJPA.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Cliente {
	//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Como vai gerar a a chave primaria, neste caso Auto-Increment
	private int idCliente;
	
	@Column(unique = true)
	private String numReg;
	
	
	private String nome;
	
	
	private String telefone;
	
	
	private String endereco;
	
	@OneToMany(mappedBy = "idPedido", fetch = FetchType.LAZY)
	@JsonIgnore //caso de exception de processamento ininito
	private List<Pedido> pedido = new ArrayList<>();
}
