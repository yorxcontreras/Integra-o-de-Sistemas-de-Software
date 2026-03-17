package Model;
public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        }
    }
}