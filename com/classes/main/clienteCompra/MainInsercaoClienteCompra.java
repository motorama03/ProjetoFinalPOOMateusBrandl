package com.classes.main.clienteCompra;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainInsercaoClienteCompra {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente(47.332, "122.786.899-59");
		if(clienteBO.inserirCompra(cliente))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
	}

}
