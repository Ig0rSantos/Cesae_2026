package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("introduza as horas: ");
        horas= input.nextInt();
        System.out.println("introduza os minutos: ");
        minutos= input.nextInt();

        // converter 24h em 12h
        //formato 24h (HH:mm): 23:45
        // formato 12h (HH:mm): 11:45 PM

        if(horas <= 12){ //Manhã - AM
            System.out.println(horas + ":" + minutos + "AM");
        }else { //Tarde - PM
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + "PM");

        }
    }
}
