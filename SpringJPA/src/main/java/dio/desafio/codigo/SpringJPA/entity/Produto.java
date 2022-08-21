package dio.desafio.codigo.SpringJPA.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Janclinton
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto {
	//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
	
	private String nomeProduto;
	
	private String tipo;
	
	private double preço;
	
	private int qtdEstoque;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JsonIgnore //caso de exception de processamento ininito
	private List<Pedido> pedido = new ArrayList<>();
}
