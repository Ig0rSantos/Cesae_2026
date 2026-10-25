package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p1,p2,p3, valorFinal;

        System.out.print("preco 1: ");
        p1= input.nextDouble();
        System.out.print("preco 2: ");
        p2= input.nextDouble();
        System.out.print("preco 3 ");
        p3= input.nextDouble();

        valorFinal= (p1+p2+p3)*.9;

        System.out.println("valor final ja com desconto e: "+ valorFinal + "€");
    }
}
