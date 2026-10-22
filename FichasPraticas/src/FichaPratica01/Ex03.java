package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variaveis
        double ladoA, ladoB, per, area;

        // Valores da area do retangulo
        System.out.print("valor lado A: ");
        ladoA = input.nextDouble();
        System.out.print(" Valor lado B: ");
        ladoB = input.nextDouble();

        // Calculo da area
        area= ladoA * ladoB;

        // calculo do perimetro - soma dos 4 lados
        per = 2 * (ladoA + ladoB);

        // Resultado
        System.out.println("Valor da area: " + area);
        System.out.println("Valor dperimetro: " + per);

    }
}
