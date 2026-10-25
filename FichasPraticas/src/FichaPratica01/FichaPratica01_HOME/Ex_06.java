package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2;
        System.out.println("valor 1 e: ");
        valor1 = input.nextInt();
        System.out.println("valor 2 e: ");
        valor2 = input.nextInt();

        //calculos
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        //resultados
        System.out.println("valores: " + valor1);
        System.out.println("valores: " + valor2);


    }
}
