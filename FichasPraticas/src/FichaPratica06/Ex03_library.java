package FichaPratica06;

import java.util.Random;
import java.util.Scanner;

public class Ex03_library {


    /**
     * Lê o numero inserido pelo utilizador
     * @param
     * @return O numero inserido
     */
    //lerNumero() -> dentro dos parentises é colocado um pre-requisito
    public static int lerNumero() {
        Scanner input = new Scanner(System.in);

        int numero;
        System.out.println("Insira um numero: ");
        numero = input.nextInt();
        return numero;
    }

    /**
     *  Lê a opção escolhida pelo utilizador
     * @param
     * @return a opção inserida
     */
    public static int lerOpcao() {
        Scanner input = new Scanner(System.in);

        int opcao;

        System.out.println("Opção: ");
        opcao = input.nextInt();

        return  opcao;
    }

    /**
     * função que determina se um número (passado por argumento) é par ou ímpar
     *
     * @param numero
     * @return retorna true se par ou false se ímpar.
     */
    public static boolean ePar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * função que determina se um número (passado por argumento) é positivo ou negativo
     *
     * @param num
     * @return retorna true se zero ou positivo, ou false se negativo.
     */
    public static boolean ePositivo(int num) {

        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Função que determina se um número (passado por argumento) é ou não primo
     *
     * @param num
     * @return Retorna true se primo ou false se não primo
     */

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * Determina se um número (passado por argumento) é perfeito
     *
     * @param num
     * @return Retorna true se perfeito ou false se não perfeito
     */
    //  (Os números perfeitos são iguais à soma dos seus
    //divisores: 6 pode ser dividido por 1, 2 e 3 e, quando soma esses números, o resultado é 6)
    public static boolean ePerfeito(int num) {

        int ePerfeito = 0;

        int soma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

        return soma == num;
    }


    /**
     * Determina se um número (passado por argumento) é triangular
     *
     * @param num
     * @return Retorna true se triangular ou false se não triangular
     */

    public static boolean eTriangular(int num) {

        int eTriangular = 0;

        for (int i = 1; eTriangular < num; i++) {
            eTriangular += i;

            if (eTriangular == num) {
                return true;
            }
        }
        return false;
    }
}








