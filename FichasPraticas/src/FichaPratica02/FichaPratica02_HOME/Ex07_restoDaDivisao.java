package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex07_restoDaDivisao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1;


        System.out.println("introduza 1 numero: ");
        num1= input.nextInt();



        if(num1 % 2==0) {
            System.out.println("o numero " + num1 + " é par");

        }else{
            System.out.println(" o numero introduzido é impar");
        }

    }
}
