package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int limite, salto, numero=0;

        System.out.println("limite: ");
        limite = input.nextInt();
        System.out.println("salto: ");
        salto = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero=numero + salto;
        }
    }
}

