package com.classes.BO;

import java.util.List;

import com.classes.DAO.VeiculoNovoDAO;
import com.classes.DTO.VeiculoNovo;

public class VeiculoNovoBO {
	public boolean inserir(VeiculoNovo veiculoNovo){
        VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.inserir(veiculoNovo);
    }
    public boolean alterar(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.alterar(veiculoNovo);
    }
    public boolean excluir(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.excluir(veiculoNovo);
    }
    public VeiculoNovo procurarPorId(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.procurarPorId(veiculoNovo);
    }
//	    public boolean existe(Pessoa pessoa){
//	    	PessoaDAO pessoaDAO = new PessoaDAO();
//	        return pessoaDAO.existe(pessoa);
//	    }
    public List<VeiculoNovo> pesquisarTodos(){
    	VeiculoNovoDAO veiculoDAO = new VeiculoNovoDAO();
        return VeiculoNovoDAO.pesquisarTodos();
	}

}
