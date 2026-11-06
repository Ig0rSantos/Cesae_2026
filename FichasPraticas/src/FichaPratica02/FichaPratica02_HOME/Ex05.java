package FichaPratica02.FichaPratica02_HOME;


import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2;

        System.out.print("introduza o primeiro numero: ");
        valor1= input.nextInt();
        System.out.println("introduza o segundo numero");
        valor2 = input.nextInt();

        if (valor1< valor2) {
            System.out.println( valor1 + " " + valor2);
        }else {
            System.out.println(valor2 + " " + valor1);
        }
    }

}