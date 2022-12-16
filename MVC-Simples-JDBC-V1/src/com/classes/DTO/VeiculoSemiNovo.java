package com.classes.DTO;

public class VeiculoSemiNovo extends Veiculo{
	private int id;
	private double valor;
	private int quantidade;
	private int ano;
	private double kmRodado;
	
	
	public VeiculoSemiNovo() {
	}
	
	public VeiculoSemiNovo(int id) {
		setId(id);
	}
	
	public VeiculoSemiNovo(String modelo) {
		super.setModelo(modelo);
	}
	
	public VeiculoSemiNovo(String modelo, String marca, double valor, int quantidade) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
	}
	
	public VeiculoSemiNovo(String modelo, String marca, double valor, int quantidade, int ano, double kmRodado) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
		setAno(ano);
		setKmRodado(kmRodado);
	}

	public VeiculoSemiNovo(String modelo, String marca, double valor, int quantidade, int ano, double kmRodado, int id) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
		setAno(ano);
		setKmRodado(kmRodado);
		setId(id);
	}
	
	public VeiculoSemiNovo(String modelo, String marca, double valor, int quantidade, int id) {
		super.setMarca(marca);
		super.setModelo(modelo);
		setValor(valor);
		setQuantidade(quantidade);
		setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Todo o desconto no valor devido o uso está aqui
	public double getValor() {
		double descontoKM = kmRodado / 10;
		valor = valor - descontoKM;
		if (ano < 2022) {
			double descontoAno = 2022 - ano;
			for(int x = 0; x < descontoAno; x++) {
				double Value = 0.044;
				valor = valor - (valor * Value);
			}
		}
		
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
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
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getKmRodado() {
		return kmRodado;
	}
	public void setKmRodado(double kmRodado) {
		this.kmRodado = kmRodado;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VeiculoSemiNovo id=");
		builder.append(id +"\n");
		builder.append("Marca= ");
		builder.append(super.getModelo()+"\n");
		builder.append("Modelo= ");
		builder.append(super.getMarca()+"\n");
		builder.append("valor=");
		builder.append(valor+"\n");
		builder.append("quantidade=");
		builder.append(quantidade+"\n");
		builder.append("ano=");
		builder.append(ano+"\n");
		builder.append("\n");
		return builder.toString();
	}
}
