package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define uma matriz 5x5
        int[][] matriz = new int[5][5];
        int soma =0; // 1- iniciar a soma a zero

        System.out.println(soma);
        soma= input.nextInt();


        // Ler os números
        // solicita elementos de linhas E colunas
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("elemento [" + linha + "] [" + coluna + "]: ");
                //matriz[linha][coluna] = input.nextInt();

                // 2- Somar o elemento introduzido à variável soma

                soma=soma + matriz[linha][coluna]; // soma += matriz[linha][coluna];

            }
        }

        // imprime a matriz
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println(); //quebra a linha
        }

        // 3. Mostrar o resultado final
        System.out.println(" a soma é:" + soma);
    }
}