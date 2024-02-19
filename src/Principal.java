
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A Espera de um Milagre");
        meuFilme.setAnoLancamento(1999);
        meuFilme.setDuracaoMinutos(189);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());


        meuFilme.avaliaFilme(8.5);
        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(7.5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do para assistir Lost: " + lost.getDuracaoMinutos());

        Filme outroFilme = new Filme("Avatar");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

         var filmeDaLuciana = new Filme("Titanic");
         filmeDaLuciana.setDuracaoMinutos(200);
         filmeDaLuciana.setAnoLancamento(2003);
         filmeDaLuciana.avaliaFilme(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaLuciana);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());


    }
}