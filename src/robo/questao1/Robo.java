package robo.questao1;

import robo.Ambiente;

/*
Observar a associacao entre Robo e Ambiente (agregacao)
Observar que o objeto sala esta final pq ele eh inicializado no construtor do Robo e nao sofre mais nenhuma alteracao no codigo
 */
public class Robo {

    private int linha, coluna;
    private final Ambiente sala;

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
        if (linha + 1 <= sala.getQtdLinhas()) {
            System.out.println("\n[Robo]: Andando para Frente");
            linha++;
        } else {
            System.out.println("[Robo] nao pode ir para frente");
        }
        mostrarPosicao();
    }

    public void andarTras() {
        if (linha - 1 >= 0) {
            System.out.println("\n[Robo]: Andando para Tras");
            linha--;
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
        if (coluna + 1 <= sala.getQtdColunas()) {
            System.out.println("\n[Robo]: Virando para Direita");
            coluna++;
        } else {
            System.out.println("\n[Robo] nao pode virar para direita");
        }
        mostrarPosicao();
    }

    public void virarEsquerda() {
        if (coluna - 1 >= 0) {
            System.out.println("\n[Robo]: Virando para Esquerda");
            coluna--;
        } else {
            System.out.println("[Robo] nao pode virar para esquerda");
        }
        mostrarPosicao();
    }

}
