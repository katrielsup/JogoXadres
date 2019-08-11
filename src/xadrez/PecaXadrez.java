package xadrez;

import jogodetabuleiro.Peca;
import jogodetabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {
	private Cor cor;

	public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
		super(tabuleiro);
		this.cor = cor;
	}

	public Cor getCor() { //So pode ser acessada
		return cor;
	}
	
}
