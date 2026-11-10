package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // declarar variaveis
        int num1,num2, resultado;
        String operacao;

        // ler valores
        System.out.print("qual o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("qual o segundo numero: ");
        num2= input.nextInt();
        System.out.print("Qual a opetação desejada? (+ - / *): ");
        operacao= input.next();


        switch (operacao) {

            case "+":
                resultado=num1+num2;
                System.out.print("a soma é: " + resultado);
                break;

            case "-":
                resultado=num1-num2;
                System.out.print("a subtração é de: " + resultado);
                break;

            case "/":
                resultado=num1/num2;
                System.out.println(" a divisão é de: " + resultado);
                break;
            case "*":
                resultado=num1*num2;
                System.out.println("a multiplicação foi de: " + resultado);
            default:
                System.out.print("Esta operação foi inválida! " + operacao);
        }
    }
}
