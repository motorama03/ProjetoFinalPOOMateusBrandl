package com.classes.DTO;

public class Cliente extends Pessoa {
	
	private double valorCompra;
	private int id;
	
	public Cliente() {
		
	}
	
	public Cliente(String cpf) {
		super.setCpf(cpf);
	}
	
	public Cliente(double valorCompra, String cpf) {
		setValorCompra(valorCompra);
		super.setCpf(cpf);
	}
	
	public Cliente(double valorCompra, String cpf, String nome, String sobreNome) {
		setValorCompra(valorCompra);
		super.setCpf(cpf);
		super.setNome(nome);
		super.setSobrenome(sobreNome);
		setId(id);
	}
	
	public Cliente(String cpf, String nome, String sobreNome) {
		setValorCompra(valorCompra);
		super.setCpf(cpf);
		super.setNome(nome);
		super.setSobrenome(sobreNome);
		setId(id);
	}
	
	public Cliente(int id) {
		setId(id);
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("ID: ");
		builder.append(id+"\n");
		builder.append("Nome: ");
		builder.append(super.getNome()+"\n");
		builder.append("Sobrenome: ");
		builder.append(super.getCpf()+"\n");
		builder.append("CPF: ");
		builder.append(super.getSobrenome()+"\n");
		builder.append("\n");
		return builder.toString();
	}
}
