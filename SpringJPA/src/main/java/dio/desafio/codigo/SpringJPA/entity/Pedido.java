package dio.desafio.codigo.SpringJPA.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_pedido")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Pedido {
	//
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	
	
	private LocalDate dataPedido = LocalDate.now();
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCliente")
	private Cliente cliente;
	
	@ManyToMany
	@JoinColumn(name = "idProduto")
	private List<Produto> produto = new ArrayList<>();
}
