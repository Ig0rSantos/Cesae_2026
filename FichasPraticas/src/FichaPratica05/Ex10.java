package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define uma matriz 3x5
        int[][] matriz = new int[3][5]; // 3 linhas 5 colunas
        int numeroPesquisar, contador = 0;

        // ler numeros
        // solicitar os elementos das linhas e das colunas

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.println("elemento [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        System.out.println("Insira o nr a pesquisar: ");
        numeroPesquisar= input.nextInt();

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {

                if(matriz[linha][coluna] == numeroPesquisar) {
                    contador++;
                }

            }
        }
        System.out.println(" Há " + contador + "posições na matriz com o numero: " + numeroPesquisar);
    }
}
// matriz.lenght dá o nr de linhas
// matriz[0].length dá o nr de colunas