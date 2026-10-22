package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, v1, v2;

        System.out.print("valor 1: ");
        valor1 = input.nextInt();
        System.out.print("Valor 2: ");
        valor2 = input.nextInt();

        // Troca de valores

        v1 = (valor1 + valor2) - valor1;
        v2 = (valor2 + valor1) - valor2;

        // Apresentar valores
        // paragrafo= \n

        System.out.println("Valores: " + v1);
        System.out.println("Valores:" + v2);

    }
}
