package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    // ln - cria uma nova linha, como se fosse 1 enter!
    //basta escrever "main" para ativar o play!
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Criar variaveis com numero inteiro
        int num1, num2, soma;

        // Ler valores do utilizador
        System.out.print("Primeiro numero :");
        num1 = input.nextInt();

        System.out.print("Segundo numero :");
        num2= input.nextInt();

        // Calcular a soma
        soma=num1 + num2;

        // Apresentar o resultado
        System.out.println("Resultado da soma: " + soma);

    }
}
