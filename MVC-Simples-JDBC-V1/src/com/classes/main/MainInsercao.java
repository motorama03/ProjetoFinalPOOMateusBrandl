package com.classes.main;

//import com.classes.BO.MarcaBO;
//import com.classes.DTO.Marca;
import com.classes.BO.PessoaBO;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Pessoa;
import com.classes.DTO.Veiculo;

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
		
		// INSER??O PARA PESSOA
		
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Matias","Brandl","12278685558");
		if(pessoaBO.inserir(pessoa))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
		
		// INSER??O PARA VEICULO
		
		VeiculoBO veiculoBO = new VeiculoBO();
		Veiculo veiculo = new Veiculo("Fiat", "Mili");
		if(veiculoBO.inserir(veiculo))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
		
	}
}