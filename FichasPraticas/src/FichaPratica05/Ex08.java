package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];


        // Ler os números
        for (int i = 0; i < matriz.length; i++) {
            for (int k = 0; k < matriz.length; k++) {
                System.out.println("numero: ");
                matriz[i][k] = input.nextInt();

            }
        }


        // Mostrar a matriz
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int k = 0; k < matriz.length; k++) { // percorre as colunas
                System.out.println(matriz[i][k] + " "); // acede ao elemento da linha e da coluna
            }
            System.out.println(); // muda de linha

        }
    }
}




