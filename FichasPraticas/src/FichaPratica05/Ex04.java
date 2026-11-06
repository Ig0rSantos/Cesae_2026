package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]  valor = new int[10]; // matriz vai de 0-10


        for(int i=0; i<valor.length; i++){
            System.out.println("insira o numero: ");
            valor[i]= input.nextInt();
        }

        System.out.println("_________________");

        //declarar o auxiliar para comparação da posição das gavetas

        int aux= valor[0]; //está na posição zero

        for(int i=0; i<valor.length; i++) {
            if(aux>valor[i]){
                aux=valor[i];
            }
        }
        System.out.println("o menor numero é: " + aux);
    }
}
