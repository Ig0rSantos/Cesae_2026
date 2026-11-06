package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex08_if_if_else_else {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaFinalPonderada;

        System.out.println("nota 1 entre 0-20: ");
        nota1= input.nextDouble();
        System.out.println("nota 2 entre 0-20: ");
        nota2= input.nextDouble();
        System.out.println("nota 3 entre 0-20: ");
        nota3= input.nextDouble();

        // proteger o codigo para não deixar inserir valores abaixo de zero e maior que 20
        if(nota1>=0 && nota1 <=20 && nota2>=0 && nota2 <=20 && nota3>=0 && nota3 <=20 ) {


            mediaFinalPonderada = (nota1 * .25) + (nota2 * .35) + (nota3 * .4);
            System.out.println("A média ponderada é de " + mediaFinalPonderada + "valores");

            if (nota1 >= 9.5) {
                System.out.println("Aluno aprovado");
            } else {
                System.out.println("Aluno reprovado");
            }
        }else{
                System.out.println("valores invalidos");}
        }
    }

