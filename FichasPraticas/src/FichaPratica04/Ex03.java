package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("introduza um numero: ");
        num = input.nextInt();

        for (int divisor = 1; divisor <= num;) {

            if(num% divisor ==0){
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}
