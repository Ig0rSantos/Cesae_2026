package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numa, numb, numc;

        System.out.print("introduzir o primeiro numero: ");
        numa= input.nextInt();
        System.out.print("introduzir o segundo numero: ");
        numb= input.nextInt();
        System.out.print("introduzir o terceiro numero: ");
        numc= input.nextInt();

        //para verificar o menor, basta trocar o sinal!
        if(numa>numb && numa>numc) {
            System.out.println("o numero maior e: " + numa);
        }
        if(numb>numa && numb>numc) {
            System.out.println("o numero maior e: " + numb);
        }
        if(numc>numa && numc>numb) {
            System.out.println("o numero maior e: " + numc);
        }
    }
}
