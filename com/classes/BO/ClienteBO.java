package com.classes.BO;

import java.util.List;

import com.classes.DAO.ClienteDAO;
import com.classes.DTO.Cliente;

public class ClienteBO {

		
	public boolean inserir(Cliente cliente){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.inserir(cliente);
    }
	public boolean inserirCompra(Cliente cliente){
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.inserirCompra(cliente);
    }
    public boolean alterar(Cliente cliente){
    	ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.alterar(cliente);
    }
    public boolean excluir(Cliente cliente){
    	ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.excluir(cliente);
    }
    public Cliente procurarPorCodigo(Cliente cliente){
    	ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.procurarPorId(cliente);
    }
    public Cliente procurarPorCpf(Cliente cliente){
    	ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.procurarPorCpf(cliente);
    }
//	    public boolean existe(Pessoa pessoa){
//	    	PessoaDAO pessoaDAO = new PessoaDAO();
//	        return pessoaDAO.existe(pessoa);
//	    }
    public List<Cliente> pesquisarTodos(){
    	ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.pesquisarTodos();
    }
}

