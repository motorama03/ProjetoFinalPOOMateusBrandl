package com.classes.DTO;

//import javax.xml.crypto.Data;

public class Vendedor extends Pessoa {
	
	private int id;
	private double salario;
//	private double totalVenda;
//	private Data dataVenda;
	
	public Vendedor() {
		
	}
	public Vendedor(String nome, String sobrenome, String cpf, double salario) {
		super.setSobrenome(sobrenome);
		super.setCpf(cpf);
		super.setNome(nome);
		setSalario(salario);
	}
	public Vendedor(String nome, String sobrenome, String cpf, double salario, int id) {
		super.setSobrenome(sobrenome);
		super.setCpf(cpf);
		super.setNome(nome);
		setSalario(salario);
		setId(id);
	}
	public Vendedor(String cpf) {
		super.setCpf(cpf);
	}
	
//	public Data getDataVenda() {
//		return dataVenda;
//	}
//	public void setDataVenda(Data dataVenda) {
//		this.dataVenda = dataVenda;
//	}
//	public double getTotalVenda() {
//		return totalVenda;
//	}
//	public void setTotalVenda(double totalVenda) {
//		this.totalVenda = totalVenda;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vendedor nome=");
		builder.append(super.getNome()+"\n");
		builder.append("Sobrenome=");
		builder.append(super.getSobrenome()+"\n");
		builder.append("Salario=");
		builder.append(salario+"\n");
		builder.append("Id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
}
