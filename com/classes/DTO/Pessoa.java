package com.classes.DTO;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public Pessoa (){
		
	}
	public Pessoa (String nome, String sobrenome, String cpf) {
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
	}
	// Para pesquisa por cpf
	public Pessoa (String cpf) {
		setCpf(cpf);
	}
	// Para pesquisa por código
	public Pessoa (int codigo) {
		setCodigo(codigo);
	}
	// para modificação
	public Pessoa(String nome, String sobrenome, String cpf, int codigo) {
		setCodigo(codigo);
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
		return "Pessoa [codigo=" + codigo + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf + "]";
	}
	
	
	
}
