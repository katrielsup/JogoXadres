package jogodetabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; // Posicao peça recem criada.
	}

	protected Tabuleiro getTabuleiro() { // Somente classes do mesmo pacote e subclasses vão poder acessar dados de uma
											// peça
		return tabuleiro;
	}

}
