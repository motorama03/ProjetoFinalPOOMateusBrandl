package com.classes.DTO;

public class Veiculo {
		
	private int id;
	private String marca;
	private String modelo;
	
	public Veiculo() {
		
	}
	
	public Veiculo(int id) {
		setId(id);
	}
	
	public Veiculo(String marca, String modelo) {
		setMarca(marca);
		setModelo(modelo);
	}
	
	public Veiculo(String modelo) {
		setModelo(modelo);
	}
	
	public Veiculo(String marca, String modelo, int id) {
		setMarca(marca);
		setModelo(modelo);
		setId(id);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "VeiculoDao [marca=" + marca + ", modelo=" + modelo + "]";
	}
}


