package robo.questao3;

import robo.Ambiente;

public class Robo {

    private int linha, coluna;
    private final Ambiente sala;
    private static final int FATORMOVIMENTO = 2;

    public Robo(int linha, int coluna, Ambiente sala) {
        this.linha = linha;
        this.coluna = coluna;
        this.sala = sala;
        System.out.println("A sala tem tamanho: " + sala.getQtdLinhas() + " x " + sala.getQtdColunas());
        mostrarPosicao();
    }

    private void mostrarPosicao() {
        System.out.println("[Robo] esta na posicao (" + linha + ", " + coluna + ") da sala");
    }

    public void andarFrente() {
        if (linha + FATORMOVIMENTO < sala.getQtdLinhas()) {
            System.out.println("\n[Robo]: Andando para Frente");
            linha += FATORMOVIMENTO;
        } else {
            System.out.println("[Robo] nao pode ir para frente");
        }
        mostrarPosicao();
    }

    public void andarTras() {
        if (linha - FATORMOVIMENTO >= 0) {
            System.out.println("\n[Robo]: Andando para Tras");
            linha -= FATORMOVIMENTO;
        } else {
            System.out.println("[Robo] nao pode ir para tras");
        }
        mostrarPosicao();
    }

    public void parar() {
        System.out.println("\n[Robo]: Parando");
        mostrarPosicao();
    }

    public void virarDireita() {
        if (coluna + FATORMOVIMENTO <= sala.getQtdColunas()) {
            System.out.println("\n[Robo]: Virando para Direita");
            coluna += FATORMOVIMENTO;
        } else {
            System.out.println("\n[Robo] nao pode virar para direita");
        }
        mostrarPosicao();
    }

    public void virarEsquerda() {
        if (coluna - FATORMOVIMENTO >= 0) {
            System.out.println("\n[Robo]: Virando para Esquerda");
            coluna -= FATORMOVIMENTO;
        } else {
            System.out.println("[Robo] nao pode virar para esquerda");
        }
        mostrarPosicao();
    }

}
