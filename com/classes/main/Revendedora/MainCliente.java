package com.classes.main.Revendedora;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;

public class MainCliente {
	public static void main(String[] args) {
		
	// Inserção
	System.out.println("Informe CPF, Nome, Sobrenome do cliente nesta respectiva ordem");
	ClienteBO clienteBO = new ClienteBO();
	Cliente cliente = new Cliente("112.647.429-59", "Vanessa", "Brandl");
	if(clienteBO.inserir(cliente))
		System.out.println("Deu bom cria");
	else
		System.out.println("F");
	
	// Exclusão
	ClienteBO clienteexBO = new ClienteBO();
	Cliente clienteex = new Cliente("122.786.879-59");
	if(clienteexBO.excluir(clienteex))
		System.out.println("GG");
	else
		System.out.println("OT :( ");
	
	// Alteração mantendo o CPF
	ClienteBO clientealtBO = new ClienteBO();
	Cliente clientealt = new Cliente("Matue", "Granny", "122.786.899-59");
	clientealtBO.alterar(clientealt);
	if(clientealtBO.alterar(clientealt))
		System.out.println("GG :) ");
	else
		System.out.println("OT D: ");
	
	// Pesquisa por cpf cliente
	ClienteBO clientepesBO = new ClienteBO();
	Cliente clientepes = new Cliente("122.786.899-59");
	clientepes = clientepesBO.procurarPorCpf(clientepes);
	System.out.println(clientepes);
	
	// Pesquisa Todos (Retorna a Lista de clientes)
	ClienteBO clientepestBO = new ClienteBO();
	List<Cliente> lista = new ArrayList<Cliente>();
	lista = clientepestBO.pesquisarTodos();	
	for (Cliente clientepest : lista) {
		System.out.println(clientepest.toString());	
	}
	
  }
}

