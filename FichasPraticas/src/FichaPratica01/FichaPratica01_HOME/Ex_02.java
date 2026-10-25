package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_02 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int n1,n2, soma, sub, div, multiplicacao;

        System.out.println("numero 1: ");
        n1 = input.nextInt();
        System.out.println("numero2: ");
        n2 = input.nextInt();

        soma=n1+n2;
        sub= n1-n2;
        div= n1/n2;
        multiplicacao= n1*n2;

        System.out.println("a soma dos 2 numeros é: " + soma);
        System.out.println("a subtracao dos 2 numeros é: " +  sub);
        System.out.println("a divisao dos 2 numeros é: " + div);
        System.out.println("a multiplicacao dos 2 numeros é: " +  multiplicacao);

        // outra forma de apresentar

        //calculo dos valores e resultados
        //criar uma variavel resultados para depois escrever o codigo
        //resultado = num1 + num2;
        // System.out.println("resultado da soma: " + resultado);
        //resultado = num1 - num2;
        //System.out.println("resultado da subtracao: " + resultado);
        //resultado = num1 * num2;
        //System.out.println("resultado da multiplicacao: " + resultado);
        //resultado = num1 / num2;
        //System.out.println("resultado da divisao: " + resultado);

    }
}
