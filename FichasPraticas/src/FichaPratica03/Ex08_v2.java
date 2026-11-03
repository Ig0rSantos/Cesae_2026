package FichaPratica03;

import java.util.Scanner;

public class Ex08_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int numero, anterior, sucessor;

        //ler valores
        System.out.println("introduzir os valores: ");
        numero = input.nextInt();

        anterior = numero - 5;
        sucessor = numero + 5;

        // Ciclo para imprimir os numeros anteriores
        while (anterior < numero) {
            anterior++; //(anterior +1)
        }
        // Ciclo para imprimir os 5 numeros sucessores
        numero++;
        while (numero <= sucessor) {
            numero++;
        }
    }
}

