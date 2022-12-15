package lib;

public class Main {

	public static void main(String[] args) {
		
//		TipoUsuario tipo = TipoUsuario.CONTROLER;
//		System.out.println(tipo.name());
//		System.out.println(tipo.toString());
//		System.out.println(tipo.ordinal());
//		for (TipoUsuario item : TipoUsuario.values()) {
//			System.out.println(item.name());
//		}
//		
//		OpcoesMenu tipo = OpcoesMenu.ABRIR;
//		switch (tipo) {
//			case ABRIR:System.out.println("Abrir");
//				break;
//				case IMPRIMIR:System.out.println();
//					break;
//				default: System.out.println("Error");
//					break;
//			
//		}
//		System.out.println(tipo.getValor());
//		
//		
		
		Familia rodrigo = new Familia();
		rodrigo.setNome("Rodrigo");
		Familia.setSobrenome("Curvelas");
		
		Familia iran = new Familia();
		iran.setNome("Iran");
		Familia.setSobrenome("Outra familia");
		
		System.out.println(rodrigo.getNome()+" "+ Familia.getSobrenome());
		System.out.println(iran.getNome()+ " "+ Familia
				.getSobrenome());
		
	}

}
