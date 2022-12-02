package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Exclusão via cpf	
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("1212512412512");
		if(pessoaBO.excluir(pessoa))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
	}                                                                                                                                                                                                                                                              
}