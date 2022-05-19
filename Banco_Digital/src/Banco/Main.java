package Banco;

import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupança;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupança = new ContaPoupança();


        Scanner input = new Scanner(System.in);
        double x;
        double a;
        System.out.println("Faça o depósito na conta corrente: ");
        x = input.nextDouble();


        cc.depositar(x);

        System.out.println("Faça uma transferência para a conta poupança: ");
        a = input.nextDouble();
        cc.transferir(a,poupança);

        cc.imprimirExtrat0();
        poupança.imprimirExtrat0();

    }

}
