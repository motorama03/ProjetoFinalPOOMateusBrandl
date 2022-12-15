package com.classes.main.clienteCompra;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainAlteracaoClienteCompra {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente();
		clienteBO.alterar(cliente);
		if(clienteBO.alterar(cliente))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
	}

}
