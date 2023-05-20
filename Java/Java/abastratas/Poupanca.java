package abastratas;

public class Poupanca extends Conta {
    public void imprimeExtrato() {
        System.out.println("Saldo" + this.getSaldo());
    }
}
