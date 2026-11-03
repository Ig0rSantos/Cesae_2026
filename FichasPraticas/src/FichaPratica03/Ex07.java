package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
       // Não necessita input do utilizador
        // Scanner input = new Scanner(System.in);

        // declarar variaveis

        int numero = 1, total=0;


        while(numero <=100){
            System.out.println(numero);
            total=total+numero;
            numero = numero + 1;

        }
        System.out.println(" somatório é: " + total );

    }
}

