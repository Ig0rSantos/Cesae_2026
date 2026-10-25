package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ladoA, ladoB, per, area;

        System.out.print("lado A do retangulo é: ");
        ladoA = input.nextInt();
        System.out.print("lado B do retangulo é: ");
        ladoB= input.nextInt();

        // calculos
        area= ladoA*ladoB;
        // calculo do perimetro - é a soma dos 4 lados
        per= 2* (ladoA+ladoB);

        System.out.println(" o perimetro é: " + per);
        System.out.println(" a area do quadrado é: "+ area);

    }
}
