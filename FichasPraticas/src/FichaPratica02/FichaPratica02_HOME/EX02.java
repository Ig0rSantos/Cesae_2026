package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        double salario,taxa ;


        System.out.println("Insira o salario: ");
        salario= input.nextDouble();

        if (salario<=15000){
            taxa= salario*.2;
            System.out.println(taxa);
        }else{
            taxa=salario*.3;
            System.out.println(taxa);
        }
    }
}

