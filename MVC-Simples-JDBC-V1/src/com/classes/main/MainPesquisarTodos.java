package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		MarcaBO marcaBO = new MarcaBO();
		List<Marca> lista = new ArrayList<Marca>();
		lista = marcaBO.pesquisarTodos();	
		for (Marca marca : lista) {
			System.out.println(marca.toString());
		}
	
	}
}