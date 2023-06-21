package br.com.infnet.infnetrefactoringstartingpoint.locadora;

public class Locacao {
    private Filme filme;
    private int diasAlugados;

    public Locacao(Filme filme, int diasAlugados) {
        this.filme = filme;
        this.diasAlugados = diasAlugados;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getDiasAlugados() {
        return diasAlugados;
    }

    public void setDiasAlugados(int diasAlugados) {
        this.diasAlugados = diasAlugados;
    }
}
