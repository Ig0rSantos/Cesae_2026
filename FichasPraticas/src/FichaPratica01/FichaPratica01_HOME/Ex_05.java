package FichaPratica01.FichaPratica01_HOME;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media, media1, media2, media3, mediaPonderada;

        System.out.print("nota1 é: ");
        nota1= input.nextDouble();
        System.out.print("nota2 é: ");
        nota2= input.nextDouble();
        System.out.print("nota3 é: ");
        nota3= input.nextDouble();

        media= (nota1+nota2+nota3)/3;
        System.out.println(" a media aritmetica é: " + media);

        media1= nota1*.2;
        media2=nota2*.3;
        media3=nota3*.5;

        mediaPonderada=media1+media2+media3;
        System.out.println(" a media ponderada é: " + mediaPonderada);

    }
}
