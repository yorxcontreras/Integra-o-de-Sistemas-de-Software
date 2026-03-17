package Controller;
import Model.Conta;

public class ContaController {
    private Conta model = new Conta();

    public void realizarDeposito(double valor) {
        model.deposito(valor);
    }

    public void realizarSaque(double valor) {
        model.saque(valor);
    }

    public double getSaldoAtual() {
        return model.getSaldo();
    }
}