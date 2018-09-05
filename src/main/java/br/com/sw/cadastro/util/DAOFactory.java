package br.com.sw.cadastro.util;

import br.com.sw.cadastro.cliente.ClienteDAO;
import br.com.sw.cadastro.cliente.ClienteDAOHibernate;

public class DAOFactory {
	public static ClienteDAO criarClienteDAO(){
		ClienteDAOHibernate clienteDAO = new ClienteDAOHibernate();
		clienteDAO.setSession(HibernateUtil.getSessionfactory().getCurrentSession());
		return clienteDAO;
	}
}
