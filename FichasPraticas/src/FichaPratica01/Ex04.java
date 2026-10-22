package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variaveis
        double area, raio , pi;

        // Ler valores
        System.out.print("valor do raio: ");
        raio = input.nextDouble();

        // Calculo
        pi = 3.14;
        area = pi * raio * raio;

        // Resultado
        System.out.println("Area da circunferencia: " + area);

    }
}
