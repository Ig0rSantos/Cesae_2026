package FichaPratica02;

import java.util.Scanner;

public class Exemplos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // se nota maior que 10, entao...

        System.out.print("a nota e: ");
        int nota = input.nextInt();
        if (nota>=10)
            System.out.println("o formando teve positiva!");
        else System.out.println("o formando teve negativa!");

        //_________________________//____________
        System.out.print(" Qual o teu curso?");
        String curso = input.next();
        if(curso.equals("software developer"))
            System.out.println("o teu curso e o melhor!");
        else System.out.println("Escolhes-te outro curso!");

        //________________________//____________________

        System.out.print("nota final foi de: ");
        int aprovados =0;
        int nota1 = input.nextInt();

        if (nota1>=10) {
            System.out.println("o formando teve positiva!");
            aprovados = aprovados +1;


        }






    }
}
