package com.classes.BO;

import java.util.List;

import com.classes.DAO.VeiculoSemiNovoDAO;
import com.classes.DTO.VeiculoSemiNovo;

public class VeiculoSemiNovoBO {
	public boolean inserir(VeiculoSemiNovo veiculoSemiNovo){
        VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.inserir(veiculoSemiNovo);
    }
    public boolean alterarPorModelo(VeiculoSemiNovo veiculoSemiNovo){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.alterarPorModelo(veiculoSemiNovo);
    }
    public boolean alterarPorId(VeiculoSemiNovo veiculoSemiNovo){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.alterarId(veiculoSemiNovo);
    }
    public boolean vendaVeiculo(VeiculoSemiNovo veiculoSemiNovo){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.vendeuUmVeiculo(veiculoSemiNovo);
    }
    public boolean excluir(VeiculoSemiNovo veiculoSemiNovo){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.excluir(veiculoSemiNovo);
    }
    public VeiculoSemiNovo procurarPorId(VeiculoSemiNovo veiculoSemiNovo){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.procurarPorId(veiculoSemiNovo);
    }
    public List<VeiculoSemiNovo> pesquisarTodos(){
    	VeiculoSemiNovoDAO veiculoSemiNovoDAO = new VeiculoSemiNovoDAO();
        return veiculoSemiNovoDAO.pesquisarTodos();
	}

}
