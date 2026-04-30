package model;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(double saldo, int numero, double limite) {
        super(saldo, numero);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
        } else {
            System.out.println("Limite insuficiente!");
        }
    }
}
