package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, impostos;

        System.out.print("Salario anual liquido: ");
        salario= input.nextDouble();


        if (salario <= 15000) {
            impostos= salario *.2; // calculo da taxa de imposto
            System.out.println("paga uma taxa de 20%: " + impostos + "€");
        }
        else {
            impostos= salario *.3; // calculo da taxa de imposto
            System.out.println("paga uma taxa de 30%: " + impostos + "€");
        }





    }
}
