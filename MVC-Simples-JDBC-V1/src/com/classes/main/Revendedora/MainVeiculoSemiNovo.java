package com.classes.main.Revendedora;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoSemiNovoBO;
import com.classes.DTO.VeiculoSemiNovo;

public class MainVeiculoSemiNovo {

	public static void main(String[] args) {
		
		// Inserção de veiculos SemiNovos
		VeiculoSemiNovoBO veiculoSemiNovoBONew = new VeiculoSemiNovoBO();
		VeiculoSemiNovo veiculoSemiNovoNew = new VeiculoSemiNovo("Ford", "Fiesta", 35000, 3, 2018, 4000);
		if(veiculoSemiNovoBONew.inserir(veiculoSemiNovoNew))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
		// Pesquisa Todos
		VeiculoSemiNovoBO veiculoSemipesNovoBO = new VeiculoSemiNovoBO();
		List<VeiculoSemiNovo> lista = new ArrayList<VeiculoSemiNovo>();
		lista = veiculoSemipesNovoBO.pesquisarTodos();	
		for (VeiculoSemiNovo veiculoSemipesNovoPes : lista) {
			System.out.println(veiculoSemipesNovoPes.toString());
		}
		
		// Exclusão de veiculo via id
		VeiculoSemiNovoBO veiculoSemiNovoBOEx = new VeiculoSemiNovoBO();
		VeiculoSemiNovo veiculoSemiNovoEx = new VeiculoSemiNovo(3);
		if(veiculoSemiNovoBOEx.excluir(veiculoSemiNovoEx))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
		
		// Alteração por id (para mudar o preço, marca etc)
		VeiculoSemiNovoBO veiculoSemiNovoBO = new VeiculoSemiNovoBO();
		VeiculoSemiNovo veiculoSemiNovo = new VeiculoSemiNovo("Geep", "Renegaid", 68000, 1, 2020, 40000, 2);
		veiculoSemiNovoBO.alterarPorId(veiculoSemiNovo);
		if(veiculoSemiNovoBO.alterarPorId(veiculoSemiNovo))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
		
		// Venda de veiculos por id (diminui a quantidade de veicuos do banco (1 por vez))
		VeiculoSemiNovoBO veiculoSemiNovoBOVendas = new VeiculoSemiNovoBO();
		VeiculoSemiNovo veiculoSemiNovoAltIdVendas = new VeiculoSemiNovo(2);
		veiculoSemiNovoBOVendas.vendaVeiculo(veiculoSemiNovoAltIdVendas);
		System.out.println("GG");
		
	}

}
