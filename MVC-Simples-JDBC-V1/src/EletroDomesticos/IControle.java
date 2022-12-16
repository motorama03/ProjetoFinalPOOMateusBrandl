package EletroDomesticos;

public interface IControle {
	public boolean ligaDesliga();
	public int alterarCanal(int Canal);
	public int canalMain();
	public int canalMenos();
	public int volumeMais1();
	public int volumeMenos();
	int volumeMais();
}
