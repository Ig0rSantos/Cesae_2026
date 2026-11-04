package FichaPratica04;

import java.util.Scanner;

public class Ex04_v1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, resultado = 0;
        String operacao, opcao;
        //boolean s=true,n=false;

        do {
            System.out.println("Qual o numero 1?: ");
            num1 = input.nextDouble();

            System.out.println("Qual o numero 2?: ");
            num2 = input.nextDouble();

            System.out.println("Qual a operação aritmetica a executar? (+ - / * ): ");
            operacao = input.next();

            switch (operacao) {

                case "+":
                    resultado = num1 + num2;
                    System.out.println("Soma é: " + resultado);
                    break;

                case "-":
                    resultado = num1 - num2;
                    System.out.println("Subtração é: " + resultado);
                    break;

                case "*":
                    resultado = num1 * num2;
                    System.out.println("Multiplicação é: " + resultado);
                    break;

                case "/":
                    resultado = num1 / num2;
                    System.out.println("Divisão é: " + resultado);
                    break;

                default:
                    System.out.println("Operação inválida: " + operacao);
                    break;
            }
            System.out.println("Deseja continuar? (sim/nao)");
            opcao = input.next();
        } while (!opcao.equals("nao"));
    }
}
