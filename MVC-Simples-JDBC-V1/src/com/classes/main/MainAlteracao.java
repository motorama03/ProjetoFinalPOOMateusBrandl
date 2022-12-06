package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Pessoa;
import com.classes.DTO.Veiculo;

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
			
		// ALTERAÇÃO VEICULO POR ID
		
		VeiculoBO veiculoBO = new VeiculoBO();
		Veiculo veiculo = new Veiculo("Ford", "GT", 2);
		veiculoBO.alterar(veiculo);
		if(veiculoBO.alterar(veiculo))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
		
	}
}