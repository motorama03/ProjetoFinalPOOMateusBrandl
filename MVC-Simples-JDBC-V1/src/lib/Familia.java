package lib;

public class Familia {
	
	private String nome;
	private static String sobrenome;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public static String getSobrenome() {
		return sobrenome;
	}
	public static void setSobrenome(String sobrenome) {
		Familia.sobrenome = sobrenome;
	}
	
	
	
}
