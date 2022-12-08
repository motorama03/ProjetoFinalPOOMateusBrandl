package com.classes.main.cliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainExclusaoCliente {

	public static void main(String[] args) {
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("122.786.899-59");
		if(clienteBO.excluir(cliente))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
	}

}
