package com.classes.main.Revendedora;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.CompraBO;
import com.classes.DTO.Compra;


public class MainCompra {

	public static void main(String[] args) {
		
//		// Inserir uma compra
//		CompraBO compraBO = new CompraBO();
//		Compra compra = new Compra(34000, "10/08/2022", "843.962.543-17", "122.786.899-59");// valor, data, cliente, vendedor, modelo
//		if(compraBO.inserirNovo(compra))
//			System.out.println("Deu bom cria");
//		else
//			System.out.println("F");
//		
//		// Pesquisa todas as compras
//		CompraBO comprapestBO = new CompraBO();
//		List<Compra> lista = new ArrayList<Compra>();
//		lista = comprapestBO.pesquisarTodos();	
//		for (Compra comprapest : lista) {
//			System.out.println(comprapest.toString());
//		}
//	
//		// Deleta via ID
		CompraBO CompraBOEx = new CompraBO();
		Compra compraEx = new Compra(7);
		if(CompraBOEx.excluir(compraEx))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
		
//		 Altarar via ID
//		CompraBO compraBOAltId = new CompraBO();
//		Compra compraAltId = new Compra(50000, "24/03/2009", "843.962.543-17", "122.786.899-59", "Golf", 2);
//		compraBOAltId.alterarPorId(compraAltId);
//		if(compraBOAltId.alterarPorId(compraAltId))
//			System.out.println("GG :) ");
//		else
//			System.out.println("OT D: ");
//		
	}
}
