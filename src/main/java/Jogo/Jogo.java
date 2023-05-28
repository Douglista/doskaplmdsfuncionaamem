
package Jogo;

public class Jogo {
    private int pontuacaoInicial;
    private int pontuacaoFinal;

    public Jogo(int pontuacaoInicial, int pontuacaoFinal) {
        this.pontuacaoInicial = pontuacaoInicial;
        this.pontuacaoFinal = pontuacaoFinal;
    }

    public Jogo(int pontuacaoInicial) {
        this.pontuacaoInicial = pontuacaoInicial;
    }

    public int getPontuacaoInicial() {
        return pontuacaoInicial;
    }

    public void setPontuacaoInicial(int pontuacaoInicial) {
        this.pontuacaoInicial = pontuacaoInicial;
    }

    public int getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(int pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal;
    }
    
}
