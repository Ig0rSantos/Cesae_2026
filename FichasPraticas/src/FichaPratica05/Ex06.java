package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeroAtual = new int[3];
        boolean crescente = true;


        //ler valores
        for (int i = 0; i < numeroAtual.length; i++) {
            System.out.println("insira um valor: ");
            numeroAtual[i] = input.nextInt();
        }

        for (int i = 1; i < numeroAtual.length; i++) {
            if (numeroAtual[i] <= numeroAtual[i - 1]) { //i começa a 1, e depois i-1 quer que o i começa a zero
                crescente = false;
            }
        }


        if (crescente) {
            System.out.println("crescente");
        } else {
            System.out.println("não cresente: ");
        }

    }
}







