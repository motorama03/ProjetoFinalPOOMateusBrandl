package com.classes.BO;

import java.util.List;

import com.classes.DAO.VendedorDAO;
import com.classes.DTO.Vendedor;

public class VendedorBO {
	public boolean inserir(Vendedor vendedor){
		VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.inserir(vendedor);
    }
//	public boolean inserirCompra(Vendedor vendedor){
//		VendedorDAO vendedorDAO = new VendedorDAO();
//        return vendedorDAO.inserirVenda(vendedor);
//    }
    public boolean alterar(Vendedor vendedor){
    	VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.alterar(vendedor);
    }
    public boolean excluir(Vendedor vendedor){
    	VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.excluir(vendedor);
    }
    public Vendedor procurarPorCodigo(Vendedor vendedor){
    	VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.procurarPorId(vendedor);
    }
    public Vendedor procurarPorCpf(Vendedor vendedor){
    	VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.procurarPorCpf(vendedor);
    }
//	    public boolean existe(Pessoa pessoa){
//	    	PessoaDAO pessoaDAO = new PessoaDAO();
//	        return pessoaDAO.existe(pessoa);
//	    }
    public List<Vendedor> pesquisarTodos(){
    	VendedorDAO vendedorDAO = new VendedorDAO();
        return vendedorDAO.pesquisarTodos();
    }
}
