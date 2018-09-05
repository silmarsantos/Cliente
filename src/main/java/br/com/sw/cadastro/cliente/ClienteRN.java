package br.com.sw.cadastro.cliente;

import java.util.List;

import br.com.sw.cadastro.util.DAOFactory;



public class ClienteRN {
	private ClienteDAO clienteDAO;

	public ClienteRN() {
		this.clienteDAO = DAOFactory.criarClienteDAO();
	}

	public Cliente carregar(Integer codigo) {
		return this.clienteDAO.carregar(codigo);
	}

	public Cliente buscarPorCodigo(Integer codigo) {
		return this.clienteDAO.buscarPorCodigo(codigo);
	}

	public void salvar(Cliente cliente) {
		Integer codigo = cliente.getCodigo();

		if (codigo == null || codigo == 0) {
			this.clienteDAO.salvar(cliente);
		} else {
			this.clienteDAO.atualizar(cliente);
		}
	}

	public void excluir(Cliente cliente) {
		this.clienteDAO.excluir(cliente);
	}

	public List<Cliente> listar() {
		return this.clienteDAO.listar();
	}
}
