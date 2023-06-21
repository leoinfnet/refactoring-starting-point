package br.com.infnet.infnetrefactoringstartingpoint.locadora;

public class Runner {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix", Filme.NORMAL);
        Filme matrixRessurrections = new Filme("Matrix Ressurrections", Filme.LANCAMENTO);
        Filme reiLeao = new Filme("Rei Leão", Filme.INFANTIL);

        Cliente cliente = new Cliente();
        cliente.setNome("João das Couves");

        Locacao locacao = new Locacao(matrix, 4);
        Locacao locacao2 = new Locacao(matrixRessurrections, 10);
        cliente.adicionarLocacao(locacao);
        cliente.adicionarLocacao(locacao2);

        String conta = cliente.conta();
        System.out.println(conta);
    }
}
