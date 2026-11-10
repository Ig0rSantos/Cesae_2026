package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex14_Ordem_Crescente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ler valores
        int a, b, c;

        System.out.println("Insira o nr A: ");
        a= input.nextInt();
        System.out.println("Insira o nr B: ");
        b= input.nextInt();
        System.out.println("Insira o nr C: ");
        c= input.nextInt();

        // a
        if(a<b && a<c) {
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        // b
        if(b<a && b<c) {
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }

        // c
        if(c<a && c<b) {
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}

