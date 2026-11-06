package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex10_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ler variaveis
        int num1, num2, resultado;
        String operacao;

        // ler valores
        System.out.println(" numero 1: ");
        num1= input.nextInt();
        System.out.println("numero 2: ");
        num2= input.nextInt();

        System.out.println("operacao pretendida (+ - / *) ");
        operacao= input.next();

        switch (operacao){
            case "+":
                resultado=num1 + num2;
                System.out.println("soma é: " + resultado);
                break;
            case "-":
                resultado=num1 - num2;
                System.out.println("subtracao é: " + resultado);
                break;
            case "/":
                resultado=num1 / num2;
                System.out.println("divisao é: " + resultado);
                break;
            case "*":
                resultado=num1 * num2;
                System.out.println("multiplicacao é: " + resultado);
                break;

            default:
                System.out.println("invalido: " + operacao);


        }



    }
}
