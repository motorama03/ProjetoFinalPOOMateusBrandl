package com.classes.DTO;

public class Compra {
	private int id;
	private double valorCompra;
	private String dataCompra;
	private String cpfCliente;
	private String cpfVendedor;
	private String modelo;
	
	public Compra() {
		
	}
	public Compra(int id) {
		setId(id);
	}
	public Compra(double valorCompra, String dataCompra, String cpfCliente, String cpfVendedor, String modelo) {
		setCpfCliente(cpfCliente);
		setCpfVendedor(cpfVendedor);
		setDataCompra(dataCompra);
		setValorCompra(valorCompra);
		setModelo(modelo);
	}
	public Compra(double valorCompra, String dataCompra, String cpfCliente, String cpfVendedor, String modelo, int id) {
		setCpfCliente(cpfCliente);
		setCpfVendedor(cpfVendedor);
		setDataCompra(dataCompra);
		setValorCompra(valorCompra);
		setModelo(modelo);
		setId(id);
	}
	public Compra(double valorCompra, String dataCompra, String cpfCliente, String cpfVendedor) {
		setCpfCliente(cpfCliente);
		setCpfVendedor(cpfVendedor);
		setDataCompra(dataCompra);
		setValorCompra(valorCompra);;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getCpfVendedor() {
		return cpfVendedor;
	}
	public void setCpfVendedor(String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra2) {
		this.dataCompra = dataCompra2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Compra [id=");
		builder.append(id);
		builder.append(", valorCompra=");
		builder.append(valorCompra);
		builder.append(", dataCompra=");
		builder.append(dataCompra);
		builder.append(", cpfCliente=");
		builder.append(cpfCliente);
		builder.append(", cpfVendedor=");
		builder.append(cpfVendedor);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
