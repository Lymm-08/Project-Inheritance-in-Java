package model;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldo, int numero) {
        super(saldo, numero);
    }

    public void renderJuros(double taxa) {
        saldo += saldo * taxa;
    }
}
