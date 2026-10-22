package FichaPratica01;

import java.util.Scanner;

public class Ex02_v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declarar variaveis
        int num1, num2, resultado;

        // Ler valores

        // sout = System.out.println
        System.out.print("Inserir o primeiro numero: ");
        num1 = input.nextInt();
        System.out.print("inserir o segundo numero: ");
        num2 = input.nextInt();

        //calculo dos valores e resultados
        resultado = num1 + num2;
        System.out.println("resultado da soma: " + resultado);
        resultado = num1 - num2;
        System.out.println("resultado da subtracao: " + resultado);
        resultado = num1 * num2;
        System.out.println("resultado da multiplicacao: " + resultado);
        resultado = num1 / num2;
        System.out.println("resultado da divisao: " + resultado);

    }

}