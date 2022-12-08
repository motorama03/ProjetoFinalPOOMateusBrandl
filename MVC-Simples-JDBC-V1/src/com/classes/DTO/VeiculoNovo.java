package com.classes.DTO;

public class VeiculoNovo extends Veiculo {
	
	private int id;
	private double valor;
	private int quantidade;
	private final int ano = 2022;
	
	public VeiculoNovo() {
		
	}
	public VeiculoNovo(String marca, String modelo, double valor, int quantidade) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
	}
	public VeiculoNovo(String marca, String modelo, double valor, int quantidade, int id, int ano) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
		setId(id);
	}
	public VeiculoNovo(String modelo) {
		setModelo(modelo);
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getAno() {
		return ano;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	// Classe que deletará um veiculo após ser vendido
	public boolean VendeVeiculoNovo() {
		// booleano para verificar venda
		boolean vendeu = false;
		if (vendeu){
			setQuantidade(quantidade - 1);
		}
		return vendeu;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoNovo: id= ");
		builder.append(id+"\n");
		builder.append("Valor= ");
		builder.append(valor+"\n");
		builder.append("Quantidade= ");
		builder.append(quantidade+"\n");
		builder.append("Marca/Modelo: ");
		builder.append(super.getMarca()+"/"+super.getModelo()+"\n");
		builder.append("\n");
		return builder.toString();
	}
}
