package FichaPratica02;

import java.util.Scanner;

    public class Ex03_v3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double salario, impostos;
            System.out.println(" Salario anual liquido: ");
            salario = input.nextDouble();

            if (salario <= 15000) {
                impostos = salario * .2;
                System.out.println("Impostos a pagar no valor de 20%: " + impostos + "€");
            } else if (salario <= 20000) {
                impostos = salario * .3;
                System.out.println("Impostos a pagar no valor de 30%: " + impostos + "€");
            } else if (salario <= 25000) {
                impostos = salario * .35;
                System.out.println("Impostos a pagar no valor de 35%: " + impostos + "€");
            } else if (salario > 25000) {
                impostos = salario * .4;
                System.out.println("Impostos a pagar no valor de 40%: " + impostos + "€");
            }

        }
    }

