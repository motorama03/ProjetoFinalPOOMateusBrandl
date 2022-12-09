package com.classes.main.cliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainInsercaoCliente {

	public static void main(String[] args) {
		
		System.out.println("Informe CPF, Nome, Sobrenome do cliente nesta respectiva ordem");
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("122.786.899-59", "Matias", "Brandl");
		if(clienteBO.inserir(cliente))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
	}

}
