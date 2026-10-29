package FichaPratica03;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Faz print dos numeros pares entre 1 e 400
       int numero = 2;

        while(numero >=1 && numero <=400){
            System.out.println(numero);
            numero = numero + 2;
        }

    }
}
