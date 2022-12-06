package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Pessoa;
import com.classes.DTO.Veiculo;

public class MainExclusao {

	public static void main(String[] args) {

		// EXCLUSÃO DE PESSOA VIA CPF
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("1212512412512");
		if(pessoaBO.excluir(pessoa))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
		
		
		// EXCLUSÃO DE VEICULO VIA MODELO
		
		VeiculoBO veiculoBO = new VeiculoBO();
		Veiculo veiculo = new Veiculo("Mili");
		if(veiculoBO.excluir(veiculo))
			System.out.println("Deu boa deletado com sucesso!");
		else
			System.out.println("Ocorreu algum erro");
	}                                                                                                                                                                                                                                                              
}