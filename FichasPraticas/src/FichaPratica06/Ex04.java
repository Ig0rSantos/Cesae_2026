package FichaPratica06;

import java.util.Scanner;

import static FichaPratica06.Ex03_library.*;

public class Ex04 {

    public static void menu() {
        Scanner input = new Scanner(System.in);

        int opcao, numero;

        numero = lerNumero();

        do {
            System.out.println("\n ANALISE DE UM NUMERO");

            System.out.println("\n1. Par ou Impar");
            System.out.println("2. Positivo ou Negativo");
            System.out.println("3. Primo ou Não Primo");
            System.out.println("4. Perfeito ou Não Perfeito");
            System.out.println("5. Triangular ou Não Triangula");
            System.out.println("6. Trocar de Número");
            System.out.println("0. Sair");


            opcao = lerOpcao();

            switch (opcao) {
                case 1: // Par ou impar
                    if(ePar(numero)){
                        System.out.println("O número é par.");
                    }else {
                        System.out.println("O número é ímpar.");
                    }
                    break;

                case 2: //Positivo ou Negativo
                    if(ePositivo(numero)){
                        System.out.println("O número é positivo.");
                    }else {
                        System.out.println("O número é negativo.");
                    }
                    break;

                case 3: // Primo ou Não Primo

                    System.out.println("Primo: " + ePrimo(numero));
                    break;

                case 4: //Perfeito ou Não Perfeito
                    System.out.println("Perfeito: " + ePerfeito(numero));
                    break;

                case 5: //Triangular ou Não Triangula
                    System.out.println("Triangular: " + eTriangular(numero));
                    break;

                case 6:
                    numero = lerNumero();
                    break;

                case 0:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opçao não reconhecida" + opcao);

            }

        } while (opcao != 0);
    }

    public static void main(String[] args) {
        menu();

    }

}

