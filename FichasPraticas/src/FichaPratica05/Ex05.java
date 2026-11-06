package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valor = new int[10]; // matriz vai de 0-10
        int soma=0;
        int media;

        for(int i=0;i< valor.length; i++){
            System.out.println("insira um valor: ");
            valor[i]= input.nextInt();
        }

        System.out.println("____________");

        for(int i=0;i< valor.length; i++) {
            soma=soma+valor.length; // soma+= valor.length;
        }
        media=soma/valor.length;
        System.out.println("a media é: " + media);
        }
    }

