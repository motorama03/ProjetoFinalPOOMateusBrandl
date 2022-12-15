package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorCpf {

	public static void main(String[] args) {

		// Teste Procurar por Cpf
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("12278685558");
		pessoa = pessoaBO.procurarPorCpf(pessoa);
		System.out.println(pessoa);

	}
}