package com.classes.main;

import com.classes.BO.MarcaBO;
import com.classes.DTO.Marca;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		MarcaBO marcaBO = new MarcaBO();
		Marca marca = new Marca(1,"Nova Marca");
		marcaBO.alterar(marca);
		marca = marcaBO.procurarPorCodigo(marca);
		System.out.println(marca);
		
	}
}