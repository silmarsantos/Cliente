package br.com.sw.cadastro.cliente;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDAOHibernate implements ClienteDAO {
	private Session session;

	public void setSession(Session session) {
		this.session = session;
	}

	public void salvar(Cliente cliente) {
		this.session.save(cliente);
	}

	public void atualizar(Cliente cliente) {
		this.session.update(cliente);
	}

	public void excluir(Cliente cliente) {
		this.session.delete(cliente);
	}

	public Cliente carregar(Integer codigo) {
		return (Cliente) this.session.get(Cliente.class, codigo);
	}

	public Cliente buscarPorCodigo(Integer codigo) {
		String hql = "select c from Cliente c where c.codigo = :codigo";
		Query consulta = this.session.createQuery(hql);
		consulta.setInteger("codigo", codigo);
		return (Cliente) consulta.uniqueResult();
	}

	public List<Cliente> listar() {
		return this.session.createCriteria(Cliente.class).list();
	}

}
