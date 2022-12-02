package com.classes.BO;

import java.util.List;
import com.classes.DAO.PessoaDAO;
import com.classes.DTO.Pessoa;

public class PessoaBO {
	
	public boolean inserir(Pessoa pessoa){
        PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.inserir(pessoa);
    }
    public boolean alterar(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.alterar(pessoa);
    }
    public boolean excluir(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.excluir(pessoa);
    }
    public Pessoa procurarPorCodigo(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorCodigo(pessoa);
    }
    public Pessoa procurarPorCpf(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorCpf(pessoa);
    }
//    public boolean existe(Pessoa pessoa){
//    	PessoaDAO pessoaDAO = new PessoaDAO();
//        return pessoaDAO.existe(pessoa);
//    }
    public List<Pessoa> pesquisarTodos(){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.pesquisarTodos();
    }
}
