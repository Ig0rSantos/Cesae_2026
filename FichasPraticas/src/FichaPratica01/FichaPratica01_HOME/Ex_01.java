package FichaPratica01.FichaPratica01_HOME;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ex_01 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int num1, num2, soma;

        System.out.print("numero 1: ");
        num1 = input.nextInt();

        System.out.print("numero 2: ");
        num2 = input.nextInt();

        soma=num1+num2;

        System.out.println("a soma dos 2 numeros é: " + soma);



    }
}
