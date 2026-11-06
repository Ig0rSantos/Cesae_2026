package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("insira 1º numero: ");
        num1= input.nextInt();
        System.out.println("insira 2º numero: ");
        num2= input.nextInt();
        System.out.println("insira o 3º numero: ");
        num3= input.nextInt();

        if(num1<num2 && num1<num3){

            System.out.println("o menor é o nr: " +num1);
        }
        if(num2<num1 && num2<num3){

            System.out.println("o menor é o nr: " +num2);
        }
        if(num3<num2 && num3<num1){

            System.out.println("o menor é o nr: " +num3);
        }
    }
}
