package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int numero1, numero2=1;

        System.out.println("Insira o primeiro numero: ");
        numero1= input.nextInt();
        System.out.println("insira o segundo numero");
        numero2= input.nextInt();

        while(numero1 <= numero2) {
            System.out.println(numero1);
            numero1=numero1 +1;
        }


    }
}

