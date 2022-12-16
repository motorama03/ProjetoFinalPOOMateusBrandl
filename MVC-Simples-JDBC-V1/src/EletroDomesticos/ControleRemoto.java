package EletroDomesticos;

public class ControleRemoto extends EquipamentoEletronico implements IControle{
	
	private int cargaPilha;
	private String marca;
	private String modelo;
	private boolean estado;
	private int volume;
	private int canal;
	
	public ControleRemoto () {
		
	}
	public ControleRemoto(int cargaPilha, String marca, String modelo, boolean estado, int volume, int canal) {
		setCanal(canal);
		setCargaPilha(cargaPilha);
		setEstado(estado);
		setMarca(marca);
		setModelo(modelo);
		setVolume(volume);
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getCargaPilha() {
		return cargaPilha;
	}

	public void setCargaPilha(int cargaPilha) {
		this.cargaPilha = cargaPilha;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ControleRemoto [cargaPilha=");
		builder.append(cargaPilha);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean ligaDesliga() {
			if(estado) {
				System.out.println("A TV está ligada \n");
			}else
				System.out.println("A TV esta desligada \n");
		return false;
	}

	@Override
	public int alterarCanal(int Canal) {
			setCanal(Canal);
		return Canal;
	}

	@Override
	public int canalMain() {
		int canalAtual = getCanal();
		setCanal(canalAtual + 1);
		return 0;
	}

	@Override
	public int canalMenos() {
			int canalAtual = getCanal();
			canalAtual = canalAtual - 1;
			setCanal(canalAtual);
		return 0;
	}

	@Override
	public int volumeMenos() {
			int vol = getVolume();
			vol = vol-1;
			setVolume(vol);
		return 0;
	}

	@Override
	public int volumeMais() {
			int vol = getVolume();
			vol = vol+1;
			setVolume(vol);
		return 0;
	}

	@Override
	public int volumeMais1() {
			int vol = getVolume();
			vol = vol+1;
			setVolume(vol);
		return 0;
	}
	
	
	
}
