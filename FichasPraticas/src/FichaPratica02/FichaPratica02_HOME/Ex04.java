package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lugar;

        System.out.println("introduza o lugar obtido: ");
        lugar= input.nextInt();

        if(lugar==1){
            System.out.println("10 pontos");
        }
        if(lugar==2){
            System.out.println("8 pontos");
        }
        if(lugar==3){
            System.out.println("6 pontos");
        }
        if(lugar==4){
            System.out.println("5 pontos");
        }
        if(lugar==5){
            System.out.println("4 pontos");
        }
        if(lugar==6){
            System.out.println("3 pontos");
        }
        if(lugar==7){
            System.out.println("2 pontos");
        }
        if(lugar==8){
            System.out.println("1 ponto");
        }
        if(lugar>8){
            System.out.println("Nao ganhou pontos!");
        }

    }
}
