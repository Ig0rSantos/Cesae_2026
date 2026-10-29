package FichaPratica03;

import java.util.Scanner;

public class Ex04_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, numero =0;

        System.out.println("Insira o limite: ");
        limite= input.nextInt();

        while (numero<=limite){
            System.out.println(numero);
        numero=numero +1;
        }
    }
    }
