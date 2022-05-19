package Contas;

public class ContaCorrente extends Conta {


    @Override
    public void imprimirExtrat0() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComuns();
    }


}
