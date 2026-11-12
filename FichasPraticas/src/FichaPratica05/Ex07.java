package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] valor =new int[3];

        //ler valores
        for (int i = 0; i < valor.length; i++) {
            System.out.println("insira um valor: ");
            valor[i] = input.nextInt();
        }

        System.out.println("____________");

        int maiorPar = valor[0];
        for (int i = 0; i < valor.length; i++) {

            if(maiorPar < valor[i]){
                if(valor[i] % 2==0){
                  maiorPar =valor[i];
                }

            }

        }
        System.out.println("maior valor par: " + maiorPar);
        }

    }

