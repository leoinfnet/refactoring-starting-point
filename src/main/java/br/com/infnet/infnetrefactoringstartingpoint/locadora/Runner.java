package br.com.infnet.infnetrefactoringstartingpoint.locadora;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix", Filme.NORMAL);
        Filme matrixRessurrections = new Filme("Matrix Ressurrections", Filme.LANCAMENTO);
        Filme reiLeao = new Filme("Rei Leão", Filme.INFANTIL);
        Filme theFlash = new Filme("The Flash", Filme.LANCAMENTO);



        Cliente cliente = new Cliente();
        cliente.setNome("João das Couves");

        Locacao locacao = new Locacao(matrix, 4);
        Locacao locacao2 = new Locacao(matrixRessurrections, 10);
        cliente.adicionarLocacao(locacao);
        cliente.adicionarLocacao(locacao2);

        String conta = cliente.conta();
        System.out.println(conta);

        Cliente zezinho = new Cliente();
        zezinho.setNome("Zezinho");
        Locacao locacao3 = new Locacao(matrix, 4);
        Locacao locacao4 = new Locacao(reiLeao, 10);
        Locacao locacao5 = new Locacao(matrixRessurrections, 10);
        Locacao locacao6 = new Locacao(theFlash, 10);

        List<Locacao> locacoes = List.of(locacao3, locacao4, locacao5, locacao6);
        for(Locacao l : locacoes){
            ErroLocacao erroLocacao = zezinho.adicionarLocacao(l);
            if(erroLocacao.equals(ErroLocacao.QUANTIDADE_ALUGUEIS_ACIMA_PERMITIDO)){
                System.out.println("Quantidade de alugueis acima do Permitido");
            }
            if(erroLocacao.equals(ErroLocacao.QUANTIDADE_LANCAMENTOS_ACIMA_PERMITIDO)){
                System.out.println("Quantidade de lancamentos acima do permitido");
            }
        }







    }
}
