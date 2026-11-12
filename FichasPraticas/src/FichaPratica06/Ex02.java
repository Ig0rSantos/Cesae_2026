package FichaPratica06;

import java.util.Scanner;

public class Ex02 {

        // Lê um número inteiro positivo
        public static int numeroPositivo() {
            Scanner input = new Scanner(System.in);

            int numero;

            do {
                System.out.print("Introduza um número inteiro positivo: ");
                numero = input.nextInt();
            } while (numero <= 0);

            return numero;
        }

        // Imprime os asteriscos
        public static void asteriscos(int quantidade) {
            for (int i = 0; i < quantidade; i++) {
                System.out.print("*");
            }
        }

        public static void main(String[] args) {

            int valor = numeroPositivo();

            System.out.print("Numero de asteriscos: " ); asteriscos(valor);
        }
    }


