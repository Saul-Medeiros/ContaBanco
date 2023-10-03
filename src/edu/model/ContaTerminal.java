package edu.model;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        System.out.print("Digite o número da Conta: ");
        int numeroConta = Integer.parseInt(input.nextLine());

        System.out.print("Digite o número da Agência: ");
        String numeroAgencia = conversor(input.nextLine().split(""));

        System.out.print("Digite o seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Informe o valor que deseja inserir em sua conta: ");
        double saldo = Double.parseDouble(input.nextLine());

        input.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + df.format(saldo) + " já está disponível para saque.");
    }

    static String conversor(String[] numero) {
        String agencia = "";

        for (String digito : numero) {
            if(digito == numero[3]) agencia += "-";
            agencia += digito;
        }
        
        return agencia;
    }

}
