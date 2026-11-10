package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ler valores
        int opcao;

        System.out.println("qual a opção a escolher: ");
        opcao= input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida");

        }
    }
}