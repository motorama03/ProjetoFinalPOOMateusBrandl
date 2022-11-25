package com.classes.BO;

import com.classes.DTO.Marca;
import com.classes.DAO.MarcaDAO;
import java.util.List;

public class MarcaBO {

    public boolean inserir(Marca marca){
        if (existe(marca) != true) {
            MarcaDAO marcasDAO = new MarcaDAO();
            return marcasDAO.inserir(marca);
        }
        return false;
    }
    public boolean alterar(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.alterar(marca);
    }
    public boolean excluir(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.excluir(marca);
    }
    public Marca procurarPorCodigo(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.procurarPorCodigo(marca);
    }
    public Marca procurarPorDescricao(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.procurarPorDescricao(marca);
    }
    public boolean existe(Marca marca){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.existe(marca);
    }
    public List<Marca> pesquisarTodos(){
        MarcaDAO marcasDAO = new MarcaDAO();
        return marcasDAO.pesquisarTodos();
    }
}