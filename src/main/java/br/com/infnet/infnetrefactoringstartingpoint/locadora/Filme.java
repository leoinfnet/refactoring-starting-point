package br.com.infnet.infnetrefactoringstartingpoint.locadora;

public class Filme {
    public static final int INFANTIL = 2;
    public static final int NORMAL = 0;
    public static final int  LANCAMENTO = 1;

    private String titulo;
    private int codigoPreco;

    public Filme(String titulo, int codigoPreco) {
        this.titulo = titulo;
        this.codigoPreco = codigoPreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigoPreco() {
        return codigoPreco;
    }

    public void setCodigoPreco(int codigoPreco) {
        this.codigoPreco = codigoPreco;
    }
}
