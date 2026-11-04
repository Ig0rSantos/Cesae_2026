package FichaPratica04;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, primo, num2=1;
        System.out.println("Introduza um numero: ");
        num1= input.nextInt();

        primo=num1/num2;

        do {
            System.out.println("O numero é primo");
            primo=input.nextInt();

        }
        while ("numero é primo" + primo);

    }
}
