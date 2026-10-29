package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor, notas;

        // Ler valores
        System.out.println("valor a levantar ");
        valor= input.nextInt();

        if (valor % 5 == 0) {
            // Apresentar valores
            notas=valor/200;
            System.out.println("nota de 200€: " + notas);
            valor= valor%200;

            notas=valor/100;
            System.out.println("nota de 100€: " + notas);
            valor=valor%100;

            notas=valor/50;
            System.out.println("nota de 50€: " + notas);
            valor=valor%50;

            notas=valor/10;
            System.out.println("nota de 10€: " + notas);
            valor=valor%10;

            notas=valor/5;
            System.out.println("nota de 5€: " + notas);
            valor=valor%5;
        } else {
            System.out.println("Não damos trocos!");
        }
    }
}
