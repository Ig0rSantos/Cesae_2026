package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faz print dos numeros inteiros até ao numero inserido
        int numero1, numero2 = 0;

        System.out.println("Introduza um numero: ");
        numero1= input.nextInt();

        //System.out.println("introduza um numero: ");
        while (numero1 >= numero2 && numero2 <= numero1) {
            System.out.println(numero2);
            numero2 = numero2  + 1;
        }
        }
    }

