package com.classes.main.Revendedora;
import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VendedorBO;
import com.classes.DTO.Vendedor;

public class MainVendedor {

	public static void main(String[] args) {
		
			// Inserção
			System.out.println("Informe CPF, Nome, Sobrenome do vendedor nesta respectiva ordem");
			VendedorBO vendedorBO = new VendedorBO();
			Vendedor vendedor = new Vendedor("Mateus", "Brandl", "122.786.899-59", 7200);
			if(vendedorBO.inserir(vendedor))
				System.out.println("Deu bom cria");
			else
				System.out.println("F");
			
			// Exclusão
			VendedorBO vendedorexBO = new VendedorBO();
			Vendedor vendedorex = new Vendedor("812.123.859-62");
			if(vendedorexBO.excluir(vendedorex))
				System.out.println("GG");
			else
				System.out.println("OT :( ");
			
			// Alteração mantendo o CPF
			VendedorBO vendedoraltBO = new VendedorBO();
			Vendedor vendedoralt = new Vendedor("Rodrigue", "Curvello", "812.123.859-62", 12000);
			vendedoraltBO.alterar(vendedoralt);
			if(vendedoraltBO.alterar(vendedoralt))
				System.out.println("GG :) ");
			else
				System.out.println("OT D: ");
			
			// Pesquisa por cpf vendedor
			VendedorBO vendedorpesBO = new VendedorBO();
			Vendedor vendedorpes = new Vendedor("812.123.859-62");
			vendedorpes = vendedorpesBO.procurarPorCpf(vendedorpes);
			System.out.println(vendedorpes);
			
			// Pesquisa Todos (Retorna a Lista de vendedores)
			VendedorBO vendedorpestBO = new VendedorBO();
			List<Vendedor> lista = new ArrayList<Vendedor>();
			lista = vendedorpestBO.pesquisarTodos();	
			for (Vendedor vendedorpest : lista) {
				System.out.println(vendedorpest.toString());	
			}
		
	}

}
