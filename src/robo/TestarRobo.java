package robo;

import robo.questao2.Robo; //aqui eu digo qual eh o robo que estou usando
import java.util.Scanner;

/*
Observar as associacoes dessa classe, pq aqui os objetos de Ambiente e Robo nao estao final?
Pq o objeto de Scanner esta final?
 */
public class TestarRobo {

    private Ambiente sala;
    private Robo mig;
    private final Scanner entrada = new Scanner(System.in);

    public void definirAmbiente() {
        System.out.println("Informe o tamanho do ambiente (quantidade de linhas e colunas)");
        int linhas = entrada.nextInt();
        int colunas = entrada.nextInt();
       sala = new Ambiente(linhas, colunas);
    }
    
    public void iniciarRobo() {
        System.out.println("Informe o fator de movimento do robo: ");
        int fator = entrada.nextInt();
        System.out.println("Informe a posicao do robo no ambiente (linha e coluna)");
        int linha = entrada.nextInt();
        int coluna = entrada.nextInt();
        mig = new Robo(linha, coluna, sala, fator);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("\n1-Andar para frente\n2-Andar para tras\n3-Parar\n4-Virar para direita\n5-Virar para esquerda\n6-Sair");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    mig.andarFrente();
                    break;
                case 2:
                    mig.andarTras();
                    break;
                case 3:
                    mig.parar();
                    break;
                case 4:
                    mig.virarDireita();
                    break;
                case 5:
                    mig.virarEsquerda();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 6);
    }

}
