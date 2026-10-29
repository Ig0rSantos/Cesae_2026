package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, resultado;
        String operacao;

        // Ler valores
        System.out.print(" Insira 1 numero: ");
        num1 = input.nextInt();
        System.out.println(" Insira outro numero: ");
        num2 = input.nextInt();

        System.out.println( "operação pretendida ( + - * /): ");
        operacao = input.next();

        switch (operacao) {

            case "+":
                resultado =num1 + num2;
                System.out.println("soma: " + resultado);
                break;

            case "-":
                resultado =num1 - num2;
                System.out.println("subtração: " + resultado);
                break;

            case "*":
                resultado =num1 * num2;
                System.out.println("multiplicação: " + resultado);
                break;

            case "/":
                resultado =num1 / num2;
                System.out.println("divisão: " + resultado);
                break;

            default:
                System.out.println("Operação inválida" + operacao);
        }
    }
}
