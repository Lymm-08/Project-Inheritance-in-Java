package view;

import javax.swing.JOptionPane;
import model.*;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(0, 1, 500);
        ContaPoupanca cp = new ContaPoupanca(0, 2);

        int op;
        do {
            String menu = "1 - Conta Corrente\n"
                        + "2 - Conta Poupança\n"
                        + "0 - Sair";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    menuContaCorrente(cc);
                    break;
                case 2:
                    menuContaPoupanca(cp);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (op != 0);
    }

    private static void menuContaCorrente(ContaCorrente cc) {
        int escolha;
        do {
            String menu = "Conta Corrente\n"
                        + "1 - Depositar\n"
                        + "2 - Sacar\n"
                        + "3 - Ver Saldo\n"
                        + "0 - Voltar";
            escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (escolha) {
                case 1:
                    double dep = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                    cc.depositar(dep);
                    break;
                case 2:
                    double saq = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                    cc.sacar(saq);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + cc.getSaldo());
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (escolha != 0);
    }

    private static void menuContaPoupanca(ContaPoupanca cp) {
        int escolha;
        do {
            String menu = "Conta Poupança\n"
                        + "1 - Depositar\n"
                        + "2 - Sacar\n"
                        + "3 - Ver Saldo\n"
                        + "4 - Render Juros\n"
                        + "0 - Voltar";
            escolha = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (escolha) {
                case 1:
                    double dep = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito:"));
                    cp.depositar(dep);
                    break;
                case 2:
                    double saq = Double.parseDouble(JOptionPane.showInputDialog("Valor do saque:"));
                    cp.sacar(saq);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo atual: " + cp.getSaldo());
                    break;
                case 4:
                    double taxa = Double.parseDouble(JOptionPane.showInputDialog("Taxa de juros (ex: 0.05 para 5%):"));
                    cp.renderJuros(taxa);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (escolha != 0);
    }
}
