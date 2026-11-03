package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numero, anterior;

        System.out.println("Insira o primeiro numero: ");
        numero = input.nextInt();

        anterior=numero-5;

        while(anterior<=numero +5){
            System.out.println(anterior);
            anterior=anterior +1;

        }
    }
}
