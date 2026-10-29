package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // variaveis
    double nota1, nota2, nota3, media;

        // leitura de dados
        System.out.println("introduzir o valor da nota 1 entre (0-20): ");
        nota1= input.nextDouble();

        System.out.println("introduzir o valor da nota 2 entre (0-20): ");
        nota2= input.nextDouble();

        System.out.println("introduzir o valor da nota 3 entre (0-20): ");
        nota3= input.nextDouble();

        // proteger o codigo para não deixar inserir valores abaixo de zero e maior que 20
        if(nota1>=0 && nota1 <=20 && nota2>=0 && nota2 <=20 && nota3>=0 && nota3 <=20 ){


            // calculo da media ponderada
            media = (nota1 * .25) + (nota2 * .35) + (nota3 * .40);
            System.out.println("A media ponderada é de:" + media);

            //validação de resultados
            if (media > 9.5) {
                System.out.println("Aluno foi aprovado");
            } else {
                System.out.println("Aluno não foi aprovado");
            }
        }else{
            System.out.println(" Valores introduzidos são inválidos");
        }
    }
}
