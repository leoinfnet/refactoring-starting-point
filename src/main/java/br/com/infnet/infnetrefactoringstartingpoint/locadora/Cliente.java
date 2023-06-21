package br.com.infnet.infnetrefactoringstartingpoint.locadora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Locacao> locacoes = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void adicionarLocacao(Locacao locacao){
        this.locacoes.add(locacao);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }
    public String conta(){
        double quantiaTotal = 0;
        int pontosLocadorFrequente = 0;
        List<Locacao> locacoes2 = this.locacoes;
        String resultado = "Registro de locacoes de " + getNome() +  "\n";
        for(Locacao l : locacoes2 ) {
            double estaQ = 0;
            switch (l.getFilme().getCodigoPreco()){
                case Filme.NORMAL :
                    estaQ += 2;
                    if(l.getDiasAlugados() > 2 ){
                        estaQ += (l.getDiasAlugados() - 2) * 1.5;
                    }
                    break;
                case Filme.LANCAMENTO:
                    estaQ += l.getDiasAlugados() * 3;
                    break;
                case Filme.INFANTIL:
                    estaQ += 1.5;
                    if(l.getDiasAlugados() > 3) {
                        estaQ += (l.getDiasAlugados() - 3) * 1.5;
                    }
                    break;
            }
            //Adicionar pontos do locador frequente
            pontosLocadorFrequente++;
            //adicionar bonus para uma locacao e lancamento por dias dias.
            if(l.getFilme().getCodigoPreco() == Filme.LANCAMENTO && l.getDiasAlugados() > 1 ){
                pontosLocadorFrequente++;
            }
            //mostrar o resultado desta locacao
            resultado += "\t" + l.getFilme().getTitulo() + "\t" + String.valueOf(estaQ) + "\n" ;
            quantiaTotal += estaQ;
        }
        //adicionar rodape
        resultado += "O valor devido é: " + String.valueOf(quantiaTotal) + "\n";
        resultado += "Você ganhou " + String.valueOf(pontosLocadorFrequente) + " pontos de locador frequente";
        return resultado;
    }
}
