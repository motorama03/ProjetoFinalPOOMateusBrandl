package com.classes.BO;

import java.util.List;

import com.classes.DAO.PessoaDAO;
import com.classes.DAO.VeiculoDAO;
import com.classes.DTO.Pessoa;
import com.classes.DTO.Veiculo;

public class VeiculoBO {
	
	public boolean inserir(Veiculo veiculo){
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.inserir(veiculo);
    }
    public boolean alterar(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.alterar(veiculo);
    }
    public boolean excluir(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.excluir(veiculo);
    }
    public Veiculo procurarPorId(Veiculo veiculo){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.procurarPorId(veiculo);
    }
    public Pessoa procurarPorCpf(Pessoa pessoa){
    	PessoaDAO pessoaDAO = new PessoaDAO();
        return pessoaDAO.procurarPorCpf(pessoa);
    }
//    public boolean existe(Pessoa pessoa){
//    	PessoaDAO pessoaDAO = new PessoaDAO();
//        return pessoaDAO.existe(pessoa);
//    }
    public List<Veiculo> pesquisarTodos(){
    	VeiculoDAO veiculoDAO = new VeiculoDAO();
        return veiculoDAO.pesquisarTodos();
    }
}
