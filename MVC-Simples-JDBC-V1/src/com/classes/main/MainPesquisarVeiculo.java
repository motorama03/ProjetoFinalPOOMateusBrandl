package com.classes.main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoBO;
import com.classes.DTO.Veiculo;

public class MainPesquisarVeiculo {

	public static void main(String[] args) {
		
		// PEGAR TODOS VEICULOS
		
		VeiculoBO veiculoBO = new VeiculoBO();
		List<Veiculo> lista = new ArrayList<Veiculo>();
		lista = veiculoBO.pesquisarTodos();	
		for (Veiculo veiculo : lista) {
			System.out.println(veiculo.toString());
		}
	
	}
	
}
