package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int[] comissao = new int[12]; // matriz vai de 0-12
        int soma=0;

        // ciclo
        for (int i = 0; i < comissao.length; i++) {

            System.out.println("insira a comissao: ");
            comissao[i] = input.nextInt();
        }
        System.out.println("_____________");

        //impressao dos valores
        for (int i = 0; i < comissao.length; i++) {
            soma = soma + comissao[i];
        }
        System.out.println("insira a comissao: " + soma);
    }
}


