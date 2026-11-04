package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, numero = 0;

        System.out.println("valor:");
        limite = input.nextInt();


        while (numero <= limite) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;

        }

    }
}
