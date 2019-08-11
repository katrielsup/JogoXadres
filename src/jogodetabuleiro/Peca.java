package jogodetabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; // Posicao pe�a recem criada.
	}

	protected Tabuleiro getTabuleiro() { // Somente classes do mesmo pacote e subclasses v�o poder acessar dados de uma
											// pe�a
		return tabuleiro;
	}

}
