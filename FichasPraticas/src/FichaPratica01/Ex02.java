package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, soma, subtracao, multiplicacao, divisao;

        // Ler valores

        // sout = System.out.println
        System.out.print("Inserir o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("inserir o segundo numero: ");
        num2 = input.nextInt();

        //calculo dos valores
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        // Apresentar o resultado
        System.out.println("resultado da soma: " + soma);
        System.out.println("resultado da subtracao: " + subtracao);
        System.out.println("resultado da multiplicacao: " + multiplicacao);
        System.out.println("resultado da divisao: " + divisao);

    }
}
