package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar as variaveis
        double salario, taxa;


        // leitura dos valores
        System.out.println("insira o salario: ");
        salario = input.nextDouble();


        if (salario <= 15000) {
            taxa = salario * .2;
            System.out.println("montante a para: " + taxa);

            if (salario >= 15000 && salario <= 20000) {
                taxa = salario * .3;
                System.out.println("taxa a pagar é de: " + taxa);
            }

            if (salario >= 20000 && salario <= 25000) {
                taxa = salario * .35;
                System.out.println("taxa a pagar é de: " + taxa);
            }

            if (salario > 25000) {
                taxa = salario * .4;
                System.out.println("taxa a pagar é de: " + taxa);

            }
        }
    }
}