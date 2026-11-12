package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][3]; // coluna com 3 linhas e 3 colunas


        // ler numeros e solicitar os elementos das linhas e colunas

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m.length; coluna++) {
                System.out.println("Elemento [" + linha + "] [" + coluna + "]: ");
                m[linha][coluna] = input.nextInt();
            }
        }

        int numMaior = m[0][0];
        int numMenor = m[0][0];

        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m.length; coluna++) {

                if (m[linha][coluna] > numMaior) {
                    numMaior = m[linha][coluna];
                }
                if (m[linha][coluna] < numMenor) {
                    numMenor = m[linha][coluna];
                }
            }

        }
        System.out.println("O maior é: " + numMaior);
        System.out.println("o menor é: " + numMenor);
    }
}