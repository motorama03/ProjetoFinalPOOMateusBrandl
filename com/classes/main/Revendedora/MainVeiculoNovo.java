package com.classes.main.Revendedora;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.VeiculoNovoBO;
import com.classes.DTO.VeiculoNovo;

public class MainVeiculoNovo {

	public static void main(String[] args) {
		
	// Alteração por modelo (para mudar o preço, marca etc)
		VeiculoNovoBO veiculoNovoBO = new VeiculoNovoBO();
		VeiculoNovo veiculoNovo = new VeiculoNovo("Chefrole", "Prisma", 50000, 10);
		veiculoNovoBO.alterarPorModelo(veiculoNovo);
		if(veiculoNovoBO.alterarPorModelo(veiculoNovo))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
	
	// Alteração por id
		VeiculoNovoBO veiculoNovoBOAltId = new VeiculoNovoBO();
		VeiculoNovo veiculoNovoAltId = new VeiculoNovo("Geep", "Renegaid", 72000, 5, 1);
		veiculoNovoBOAltId.alterarPorId(veiculoNovoAltId);
		if(veiculoNovoBOAltId.alterarPorId(veiculoNovoAltId))
			System.out.println("GG :) ");
		else
			System.out.println("OT D: ");
		
	// Exclusão de veiculo via modelo
		VeiculoNovoBO veiculoNovoBOEx = new VeiculoNovoBO();
		VeiculoNovo veiculoNovoEx = new VeiculoNovo("Renegaid");
		if(veiculoNovoBOEx.excluir(veiculoNovoEx))
			System.out.println("GG");
		else
			System.out.println("OT :( ");
		
	// Inserção de veiculos Novos
		VeiculoNovoBO veiculoNovoBONew = new VeiculoNovoBO();
		VeiculoNovo veiculoNovoNew = new VeiculoNovo("Fiat", "Uno MILI", 9.000, 15);
		if(veiculoNovoBONew.inserir(veiculoNovoNew))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
		
	// Pesquisa de todos veiculos
		VeiculoNovoBO veiculoNovoBOPes = new VeiculoNovoBO();
		List<VeiculoNovo> lista = new ArrayList<VeiculoNovo>();
		lista = veiculoNovoBOPes.pesquisarTodos();	
		for (VeiculoNovo veiculoNovoPes : lista) {
			System.out.println(veiculoNovoPes.toString());
		}
			
	// Venda de veiculos (diminui a quantidade de veicuos do banco (1 por vez))
		VeiculoNovoBO veiculoNovoBOVendas = new VeiculoNovoBO();
		VeiculoNovo veiculoNovoAltIdVendas = new VeiculoNovo("Uno MILI");
		veiculoNovoBOVendas.vendaVeiculo(veiculoNovoAltIdVendas);
		System.out.println("GG");
	
	
	}

}
