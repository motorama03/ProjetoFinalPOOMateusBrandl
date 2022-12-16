package com.classes.BO;


import java.util.List;

import com.classes.DAO.CompraDAO;
import com.classes.DTO.Compra;

public class CompraBO {
	public boolean inserirNovo(Compra compra){
        CompraDAO compraDAO = new CompraDAO();
        return compraDAO.inserir(compra);
    }
	public List<Compra> pesquisarTodos(){
    	CompraDAO compraDAO = new CompraDAO();
        return compraDAO.pesquisarTodos();
	}
  public boolean alterarPorId(Compra compra){
	CompraDAO compraDAO = new CompraDAO();
    return compraDAO.alterarId(compra);
}
	public boolean excluir(Compra compra){
		CompraDAO compraDAO = new CompraDAO();
	    return compraDAO.excluir(compra);
	}
}
