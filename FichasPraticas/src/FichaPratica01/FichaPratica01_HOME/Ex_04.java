package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double area, raio, pi;

        System.out.println("o raio é: ");
        raio= input.nextDouble();

        // calculos
        pi= 3.14;
        area= pi* raio*raio;

        System.out.println(" a area da circunferencia é: "+ area);
    }
}
