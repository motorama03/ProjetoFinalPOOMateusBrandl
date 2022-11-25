package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca(1);
		if (marcaBO.excluir(marca))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}