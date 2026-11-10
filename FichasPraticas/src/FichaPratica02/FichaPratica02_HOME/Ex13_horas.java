package FichaPratica02.FichaPratica02_HOME;

import java.util.Scanner;

public class Ex13_horas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declarar variaveis
        int horas, minutos;

        // ler valores
        System.out.print("Insira as horas: ");
        horas= input.nextInt();
        System.out.print("Insira os minutos: ");
        minutos= input.nextInt();

        if(horas <=12){ // Manhã - AM
            System.out.println("São " + horas + ":" + minutos + "AM");
        }else{ // Tarde - PM
            horas= horas-12;
            System.out.println("São " + horas + ":" + minutos + "PM");
        }

    }
}
