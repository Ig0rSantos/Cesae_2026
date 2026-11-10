package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex11_if_else {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    //declarar variaveis
    double saldo, movimento;

    // ler valores
        System.out.println("saldo da conta");
        saldo= input.nextDouble();
        System.out.println("Movimentos");
        movimento= input.nextDouble();

        if(saldo + movimento >=0){ //saldo positivo
            System.out.println("Operação Válida");
            saldo=saldo+movimento;
        }else{
            System.out.println("Operação Inválida, saldo insuficiente");
        }
        System.out.println("Saldo final é de: " + saldo);
    }
}
