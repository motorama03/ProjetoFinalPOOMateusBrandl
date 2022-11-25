package com.classes.DTO;

public class Pessoa {
	
	private int codigo;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	private String nome;
	private String cpf;
	
	public Pessoa (){
		
	}
	public Pessoa (String nome, String cpf) {
		setCpf(cpf);
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}
