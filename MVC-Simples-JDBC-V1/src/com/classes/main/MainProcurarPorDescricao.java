package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainProcurarPorDescricao {

	public static void main(String[] args) {

		// Teste Procurar por Descricao
		// retorna o primeiro encontrado
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca("Android");
		marca = marcaBO.procurarPorDescricao(marca);
		System.out.println(marca);

	}
}