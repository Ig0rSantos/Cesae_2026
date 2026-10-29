package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faz print dos numeros inteiros até ao numero inserido
        int numero1, numero2 = 1;
        String mensagem;

        System.out.println("Introduza um numero: ");
        numero1= input.nextInt();
        System.out.println("Escreva a mensagem: ");
        mensagem= input.next();

        //System.out.println("introduza um numero: ");
        while (numero1 >= numero2 && numero2 <= numero1) {
            System.out.println(mensagem);
            numero2 = numero2  + 1;
        }
    }
}

