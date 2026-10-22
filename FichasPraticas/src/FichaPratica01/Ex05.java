package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media, media1, media2, media3, mediaPonderada;

        // Valores
        System.out.print("Nota 1: ");
        nota1 = input.nextDouble();
        System.out.print("Nota 2: ");
        nota2 = input.nextDouble();
        System.out.print("Nota 3: ");
        nota3 = input.nextDouble();

        // calculo da media aritmetica
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media aritmetica: " + media);


        // Calculo da media ponderada
        media1 = nota1 * 0.20;
        media2 = nota2 * 0.3;
        media3 = nota3 * 0.5;
        //mediaPonderada = nota1 + 0.2 + nota2 * 0.3 + nota3 * 0.5;
        mediaPonderada = (media1 + media2 + media3);
        System.out.println("Media ponderada: " + mediaPonderada);


        // Resultado
        //System.out.println("Media aritmetica: " + media);
        //System.out.println("Media ponderada: " + mediaPonderada);



    }
}
