package Veiw;
public class ExtratoView {
    public void renderizar(double saldo) {
        System.out.println("======= EXTRATO =======");
        System.out.printf("Saldo Atual: R$ %.2f%n", saldo);
        System.out.println("=======================");
    }
}