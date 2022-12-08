package com.classes.main.cliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainAlteracaoCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("Matue", "Granny", "122.786.899-59");
		clienteBO.alterar(cliente);
		if(clienteBO.alterar(cliente))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
	}

}
