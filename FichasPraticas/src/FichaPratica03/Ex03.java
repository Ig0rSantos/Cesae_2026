package FichaPratica03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faz print dos numeros pares entre 531 e 750
        int numero = 531;

        while(numero <=750){
            System.out.println(numero);
            numero = numero + 2;
        }

    }
}

