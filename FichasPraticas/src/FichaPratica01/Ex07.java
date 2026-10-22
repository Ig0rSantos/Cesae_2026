package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double p1, p2, p3, valorFinal;

        System.out.print("Preco 1: ");
        p1 = input.nextDouble();
        System.out.print("Preco 2: ");
        p2 = input.nextDouble();
        System.out.print("Preco 3: ");
        p3 = input.nextDouble();

        // valor final com desconto
        valorFinal = (p1+p2+p3) * 0.9;

        System.out.println("valor final com 10% de desconto: " + valorFinal + "€");


    }
}
