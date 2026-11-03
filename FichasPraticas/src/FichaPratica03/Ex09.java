package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // conatador e somatorio a -1 porque esta a equilibrar as contas do num
        //
        // nvezes= numero de vezes que o utilizador introduziu o numero

    int num=0, soma=0, media, nvezes=0;

        while(num!=-1) // num é diferente de -1
            {
            System.out.println("Introduza o numero");
            num= input.nextInt();

            if(num!=-1){
                soma=soma+num;
                nvezes++;
            }
        }

        System.out.println("somatorio: " + soma);
        System.out.println("numero de vezes: " + nvezes);

        media=soma/nvezes;
        System.out.println("media= " +media);

    }
}
