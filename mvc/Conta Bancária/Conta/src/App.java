import Controller.ContaController;
import Veiw.ExtratoView;

public class App {
    public static void main(String[] args) {
       
        ContaController controller = new ContaController();
        ExtratoView view = new ExtratoView();

        controller.realizarDeposito(500.0);
        controller.realizarSaque(150.0);

        view.renderizar(controller.getSaldoAtual());
    }
}