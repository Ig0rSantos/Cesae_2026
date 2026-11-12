package FichaPratica06;

import java.util.Scanner;

public class EX01 {

           public static void fazerBarulho(String animal) {

               switch (animal.toLowerCase()) {
                   case "cão":
                   case "cao":
                       System.out.println("Au au au");
                       break;
                   case "gato":
                       System.out.println("Miau");
                       break;
                   case "peixe":
                       System.out.println("Glub Glub");
                       break;
                   case "vaca":
                       System.out.println("Muuuu");
                       break;
                   case "porco":
                       System.out.println("Oinc oinc");
                       break;
                   default:
                       System.out.println("Animal desconhecido");
               }
           }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um animal: ");
        String animal = input.nextLine();

        fazerBarulho(animal);
    }
}
