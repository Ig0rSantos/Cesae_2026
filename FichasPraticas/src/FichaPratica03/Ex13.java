package FichaPratica03;

import java.util.Scanner;

    public class Ex13 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // declarar variaveis
            int limite, numero;

            System.out.println("Insira o numero: ");
            numero = input.nextInt();

            System.out.println("Insira o limite: ");
            limite = input.nextInt();


            while (numero <= limite) {
                if(numero % 5 == 0) // resto da divisao inteira de 5 é igual a zero
                    {
                    System.out.println(numero);
                }
                numero ++;
        }
    }
}
