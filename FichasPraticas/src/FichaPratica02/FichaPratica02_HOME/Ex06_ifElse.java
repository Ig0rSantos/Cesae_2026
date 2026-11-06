package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex06_ifElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // declarar variaveis
        int valor1, valor2;

        //ler valores
        System.out.println("insira o primeiro valor");
        valor1= input.nextInt();

        System.out.println("insira o segundo valor");
        valor2= input.nextInt();


        if(valor1 > valor2){
            System.out.println(valor1 + " " + valor2);
        }else {
            System.out.println(valor2 + " " + valor1);
        }
    }
}
