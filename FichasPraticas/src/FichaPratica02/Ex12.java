package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao;

        // Apresentar menu
        System.out.println( "escolha a opção desejada");
        System.out.println("1 - Criar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Eliminar");
        System.out.println("4 - Sair");
        opcao = input.nextInt();


        switch (opcao) {

            case 1:
                System.out.println( "Opçao escolhida foi Criar");
                break;

            case 2:
                System.out.println( "Opçao escolhida foi Atualizar");
                break;

            case 3:
                System.out.println( "Opçao escolhida foi Eliminar");
                break;

            case 4:
                break;

            default:
                System.out.println(" Opção escolhida é invalida");
        }





    }
}
