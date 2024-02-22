package lista.colecao.dados.dados;

import java.util.ArrayList;

public class PrincipalNewProduto {
    public static void main(String[] args) {
        NewProduto produto1 = new NewProduto("Ar condicionado", 2000.0);
        NewProduto produto2 = new NewProduto("Aquecedor", 800.0);
        NewProduto produto3 = new NewProduto("Ventilador", 150.0);

        ArrayList<NewProduto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        for (NewProduto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
