package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca("LG");
		if (marcaBO.existe(marca))
			System.out.println("Marca Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}