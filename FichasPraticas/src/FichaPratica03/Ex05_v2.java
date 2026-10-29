package FichaPratica03;

import java.util.Scanner;

public class Ex05_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int limite, numero =1;
        String mensagem;

        System.out.println("Insira o limite: ");
        limite= input.nextInt();

        // apanhar o ENTER apos inserir o numero! (a mensagem estava em "fila de espera"
       // se tiver feito algum input antes, deve-se usar o buffer!
        mensagem= input.nextLine();

        System.out.println("Insira a mensagem: ");
        mensagem= input.nextLine();


        while (numero<=limite){
            System.out.println(mensagem);
            numero=numero +1;
        }
    }
}

