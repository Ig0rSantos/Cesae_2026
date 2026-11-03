package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numero, limite=1;

        System.out.println("Insira o primeiro numero: ");
        numero= input.nextInt();
        System.out.println("insira o numero limite");
       limite= input.nextInt();

        while(numero <= limite) {
            System.out.println(numero);
            numero=numero +1;
        }
    }
}

