package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(3);
		pessoa = pessoaBO.procurarPorCodigo(pessoa);
		System.out.println(pessoa);
		
	}
}