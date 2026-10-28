package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("inserir um numero:");
        num= input.nextInt();

        // (num % 2 == 0): % retorna o resto da divisão.
        // Se dividir 2 e o resto der zero, o numero é par.

        if (num % 2 == 0) {
            System.out.println("o numero inserido é par");
        }else{
            System.out.println("o numero e impar");
        }

    }
}
