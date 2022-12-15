package com.classes.BO;

import java.util.List;

import com.classes.DAO.VeiculoNovoDAO;
import com.classes.DTO.VeiculoNovo;

public class VeiculoNovoBO {
	public boolean inserir(VeiculoNovo veiculoNovo){
        VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.inserir(veiculoNovo);
    }
    public boolean alterarPorModelo(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.alterarPorModelo(veiculoNovo);
    }
    public boolean alterarPorId(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.alterarId(veiculoNovo);
    }
    public boolean vendaVeiculo(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.vendeuUmVeiculo(veiculoNovo);
    }
    public boolean excluir(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.excluir(veiculoNovo);
    }
    public VeiculoNovo procurarPorId(VeiculoNovo veiculoNovo){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.procurarPorId(veiculoNovo);
    }
    public List<VeiculoNovo> pesquisarTodos(){
    	VeiculoNovoDAO veiculoNovoDAO = new VeiculoNovoDAO();
        return veiculoNovoDAO.pesquisarTodos();
	}

}
