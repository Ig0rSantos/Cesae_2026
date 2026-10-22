package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int minutosLidos, segundosLidos, totalSegundosAlbum=0;
// total segundos do album

        System.out.print("minutos musica 1: ");
        minutosLidos = input.nextInt();
        System.out.print("segundos musica 1: ");
        segundosLidos = input.nextInt();
        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("minutos musica 2: ");
        minutosLidos = input.nextInt();
        System.out.print("segundos musica 2: ");
        segundosLidos = input.nextInt();
        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("minutos musica 3: ");
        minutosLidos = input.nextInt();
        System.out.print("segundos musica 3: ");
        segundosLidos = input.nextInt();
        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("minutos musica 4: ");
        minutosLidos = input.nextInt();
        System.out.print("segundos musica 4: ");
        segundosLidos = input.nextInt();
        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.print("minutos musica 5: ");
        minutosLidos = input.nextInt();
        System.out.print("segundos musica 5: ");
        segundosLidos = input.nextInt();
        totalSegundosAlbum = totalSegundosAlbum + (minutosLidos * 60) + segundosLidos;

        System.out.println("total de segundos: " + totalSegundosAlbum + "s");

        int horas, minutos, segundo;

        horas = totalSegundosAlbum / 3600;
        totalSegundosAlbum = totalSegundosAlbum % 3600;
        minutos= totalSegundosAlbum / 60;


        // 1h -> 61000

        System.out.println()




    }

}
