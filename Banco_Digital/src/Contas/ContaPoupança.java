package Contas;

public class ContaPoupança extends Conta {


    @Override
    public void imprimirExtrat0() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComuns();
    }
}
