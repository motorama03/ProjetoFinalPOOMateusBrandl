package com.classes.main;

//import com.classes.BO.MarcaBO;
//import com.classes.DTO.Marca;
import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainInsercao {
	public static void main(String[] args) {
//		// Teste Inserir
//		MarcaBO marcaBO = new MarcaBO();
//		Marca marca = new Marca("Dell");
//		if (marcaBO.inserir(marca))
//			System.out.println("Inserido com Sucesso");
//		else
//			System.out.println("Erro ao Inserir");
//		marca = new Marca("Android");
//		if (marcaBO.inserir(marca))
//			System.out.println("Inserido com Sucesso");
//		else
//			System.out.println("Erro ao Inserir");
//		marca = new Marca("LG");
//		if (marcaBO.inserir(marca))
//			System.out.println("Inserido com Sucesso");
//		else
//			System.out.println("Erro ao Inserir");
		
		// meu
		PessoaBO pessoaBO= new PessoaBO();
		Pessoa pessoa = new Pessoa("Mateus", "122.786.899-59");
		if(pessoaBO.inserir(pessoa))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
		
	}
}