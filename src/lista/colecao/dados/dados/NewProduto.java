package lista.colecao.dados.dados;

class NewProduto {
    private String nome;
    private double preco;

    public NewProduto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}