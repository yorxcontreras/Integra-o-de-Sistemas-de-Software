package View;

import java.util.List;
import Model.Produto;
public class ProdutoView {
public void exibirProduto(Produto produto) {
System.out.println("\n=== Detalhes do Produto ===");
System.out.println("ID: " + produto.getId());
System.out.println("Nome: " + produto.getNome());
System.out.println("Preço: R$ " + produto.getPreco());
}
{
System.out.println("\n=== Lista de Produtos ===");
for (Produto p : Produtos) {
System.out.println(p.getId() + " - " + p.getNome()
+ " - R$ " + p.getPreco());
}
}
public void mostrarMensagem(String msg) {
System.out.println(msg);
}
}