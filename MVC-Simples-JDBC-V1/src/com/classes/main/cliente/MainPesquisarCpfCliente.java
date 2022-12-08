package com.classes.main.cliente;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainPesquisarCpfCliente {
	public static void main(String[] args) {

		// Teste Procurar por Cpf
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("122.786.899-59");
		cliente = clienteBO.procurarPorCpf(cliente);
		System.out.println(cliente);

	}
}
