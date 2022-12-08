package com.classes.main.veiculoNovo;

import com.classes.BO.VeiculoNovoBO;
import com.classes.DTO.VeiculoNovo;

public class MainInsercaoVeiculoNovo {

	public static void main(String[] args) {
		VeiculoNovoBO veiculoNovoBO = new VeiculoNovoBO();
		VeiculoNovo veiculoNovo = new VeiculoNovo("Chefrole", "Prisma", 69.000, 5);
		if(veiculoNovoBO.inserir(veiculoNovo))
			System.out.println("Deu bom cria");
		else
			System.out.println("F");
	}

}
