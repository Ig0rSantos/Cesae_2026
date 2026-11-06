package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double num1, num2;


        System.out.println("Insira o primeiro numero: ");
        num1= input.nextDouble();
        System.out.println("Insira o segundo numero");
        num2= input.nextInt();

        if (num1>num2){
            System.out.println("Maior: " + num1);
        }else{
            System.out.println("Maior: " + num2);
        }
    }
}
