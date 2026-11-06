package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int [] vetor= new int[10]; // Matriz vai de 0 a 9

        // leitor dos valores
        // vetor.length irá substituir o valor introduzido acima
        for (int i=0; i<vetor.length; i++){
            System.out.print("insira no vetor[" + i + "]: "); // o valor inserido aparece dentro de []
            vetor[i] = input.nextInt();
        }
        System.out.println("___________________");

        // impressão dos valores
        for(int i=0; i< vetor.length; i++){
            System.out.println("vetor [" + i + "]: " + vetor[i]);
        }
    }
}
