public class PrincipalMusica {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Malemolência";
        minhaMusica.artista = "Sei lá quem é";
        minhaMusica.anoLancamento = 2006;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Media das avaliações: " + mediaAvaliacoes);

    }
}
