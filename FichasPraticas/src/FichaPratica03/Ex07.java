package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Faz print dos numeros pares entre 1 e 400
        int numero = 1, total=0;


        while(numero >=1 && numero <=100){
            System.out.println(numero);
            total=total+numero;
            numero = numero + 1;

        }
        System.out.println(" somatório é: " + total );

    }
}

