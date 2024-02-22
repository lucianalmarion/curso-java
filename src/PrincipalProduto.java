//Classe br.com.alura.screenmatch.principal.Principal
public class PrincipalProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Celular");
        produto.setPreco(2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());
    }
}
