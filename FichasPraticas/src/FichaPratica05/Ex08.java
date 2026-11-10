package FichaPratica05;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 1;
        switch (opcao) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
                break;
            default:
                System.out.print("C");
        }
    }
}
