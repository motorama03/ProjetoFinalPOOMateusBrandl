package com.classes.BO;

//import java.util.List;

import com.classes.DAO.PessoaDAO;
import com.classes.DTO.Pessoa;

public class PessoaBO {
	
	public boolean inserir(Pessoa pessoa){
        
            PessoaDAO pessoaDAO = new PessoaDAO();
            return pessoaDAO.inserir(pessoa);
        
    }
//    public boolean alterar(Pessoa pessoa){
//    	PessoaDAO marcasDAO = new PessoaDAO();
//        return pessoaDAO.alterar(pessoa);
//    }
//    public boolean excluir(Pessoa pessoa){
//    	PessoaDAO marcasDAO = new PessoaDAO();
//        return marcasDAO.excluir(pessoa);
//    }
//    public Marca procurarPorCodigo(Pessoa pessoa){
//    	PessoaDAO marcasDAO = new PessoaDAO();
//        return marcasDAO.procurarPorCodigo(marca);
//    }
//    public Marca procurarPorDescricao(Pessoa pessoa){
//    	PessoaDAO marcasDAO = new PessoaDAO();
//        return marcasDAO.procurarPorDescricao(pessoa);
//    }
//    public boolean existe(Pessoa pessoa){
//    	PessoaDAO pessoaDAO = new PessoaDAO();
//        return pessoaDAO.existe(pessoa);
//    }
//    public List<Marca> pesquisarTodos(){
//    	PessoaDAO marcasDAO = new PessoaDAO();
//        return marcasDAO.pesquisarTodos();
//    }
}
