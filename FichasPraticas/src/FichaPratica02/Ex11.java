package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoAtual, movimentoDeConta, saldoNegativo;

        System.out.print("Saldo da conta bancaria: ");
        saldoAtual = input.nextDouble();
        System.out.println("Montante pretendido: ");
        movimentoDeConta = input.nextDouble();

        saldoAtual = saldoAtual + movimentoDeConta;
        saldoNegativo= saldoAtual - movimentoDeConta;
        //System.out.println("Qual o saldo da conta atual: " + saldoAtual);

        if (saldoAtual >= 0 && movimentoDeConta <= saldoAtual) {
            System.out.println("Operação válida");
            System.out.println("Saldo atual: " + saldoAtual + "€");
        }else{
            System.out.println("Operacao invalida. Saldo insuficiente");
            //System.out.println( saldoAtual + "€");
            System.out.println("Saldo atual: " + saldoNegativo + "€");
            }

        }
    }