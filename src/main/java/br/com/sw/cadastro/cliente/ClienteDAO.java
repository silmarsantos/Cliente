package br.com.sw.cadastro.cliente;

import java.util.List;

public interface ClienteDAO {

	public void salvar(Cliente cliente);

	public void atualizar(Cliente cliente);

	public void excluir(Cliente cliente);

	public Cliente carregar(Integer codigo);

	public Cliente buscarPorCodigo(Integer codigo);

	public List<Cliente> listar();

}
