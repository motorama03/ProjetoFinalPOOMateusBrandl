package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainProcurarPorCodigo {

	public static void main(String[] args) {
			
		// Teste Procurar por Codigo
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca(1,"");
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}