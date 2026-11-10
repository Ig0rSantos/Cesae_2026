package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex15_ordemCrescenteDecrescente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ler valores
        int a, b, c;
        String escolha;

        System.out.println("Insira o nr A: ");
        a= input.nextInt();
        System.out.println("Insira o nr B: ");
        b= input.nextInt();
        System.out.println("Insira o nr C: ");
        c= input.nextInt();
        System.out.println("Escolha a letra (C) para crescente e a letra (D) para decrescente: ");
        escolha=input.next();



        switch(escolha){

            case "C":

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
        break;


        case "D":

        // a
        if(a<b && a<c) {
            if (b < c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        // b
        if(b<a && b<c) {
            if (a < c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

        // c
        if(c<a && c<b) {
            if (a < b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
        break;

        default:
        System.out.println("Operação não reconhecida: " + escolha);


        }
    }
}
