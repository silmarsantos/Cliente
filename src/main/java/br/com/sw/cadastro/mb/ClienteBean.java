package br.com.sw.cadastro.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.sw.cadastro.cliente.Cliente;
import br.com.sw.cadastro.cliente.ClienteRN;

@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean {
	private Cliente cliente = new Cliente();
	private List<Cliente> lista;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String novo() {
		this.cliente = new Cliente();
		return "/publico/cliente";
	}

	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(this.cliente);

		return "clientesucesso";

	}
	
	public List<Cliente> getLista() { 
		if (this.lista == null) {
			ClienteRN clienteRN = new ClienteRN();
			this.lista = clienteRN.listar();
			
		}
		return this.lista;
	}
	
	public String consulta() {
		return "/publico/consultacliente";
	}
	
	public String menu(){
		return "index";
	}

}
