package dio.desafio.codigo.SpringJPA.service.impl;

import java.util.List;
import dio.desafio.codigo.SpringJPA.entity.Cliente;
import dio.desafio.codigo.SpringJPA.entity.Pedido;
import dio.desafio.codigo.SpringJPA.entity.form.ClienteForm;
import dio.desafio.codigo.SpringJPA.entity.form.ClienteFormUpdate;
import dio.desafio.codigo.SpringJPA.service.IClienteService;

public class ClienteServiceImpl implements IClienteService{

	@Override
	public Cliente create(ClienteForm form) {
		Cliente cliente = new Cliente();
		cliente.setNome(form.getNome());
		cliente.setNumReg(form.getNumReg());
		cliente.setTelefone(form.getTelefone());
		cliente.setEndereco(form.getEndereco());
		return cliente;
	}

	@Override
	public Cliente get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente update(int id, ClienteFormUpdate form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pedido> getallPedidosId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
