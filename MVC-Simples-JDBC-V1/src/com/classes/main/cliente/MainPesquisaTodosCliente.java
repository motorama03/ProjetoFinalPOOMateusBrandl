package com.classes.main.cliente;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainPesquisaTodosCliente {

	public static void main(String[] args) {
		// Pesquisa Todos (Retorna a Lista de clientes)
		ClienteBO clienteBO = new ClienteBO();
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}
	}

}
