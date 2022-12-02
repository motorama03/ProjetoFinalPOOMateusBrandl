package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Matue", "Granny", "12278685558");
		pessoaBO.alterar(pessoa);
		if(pessoaBO.alterar(pessoa))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
			
		
	}
}