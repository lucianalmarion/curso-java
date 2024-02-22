package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoLancamento;
    private int duracaoMinutos;
    private int totalAvaliacoes;
    private boolean inclusoPlano;
    private double somaAvaliacao;

    public void exibeFichaTecnica() {
        System.out.println("Nome do Filme: " + this.getNome());
        System.out.println("Ano de Lançamento: " + this.getAnoLancamento());
    }

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isInclusoPlano() {
        return inclusoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void setInclusoPlano(boolean inclusoPlano) {
        this.inclusoPlano = inclusoPlano;
    }

    public void avaliaFilme(double nota) {
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaAvaliacao / totalAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
