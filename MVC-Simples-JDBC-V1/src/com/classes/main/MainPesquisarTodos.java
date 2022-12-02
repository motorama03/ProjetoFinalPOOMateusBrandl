package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainPesquisarTodos {

	public static void main(String[] args) {
		
		// Teste Pesquisar Todos (Retorna a Lista de Marcas)
		PessoaBO pessoaBO = new PessoaBO();
		List<Pessoa> lista = new ArrayList<Pessoa>();
		lista = pessoaBO.pesquisarTodos();	
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.toString());
		}
	
	}
}