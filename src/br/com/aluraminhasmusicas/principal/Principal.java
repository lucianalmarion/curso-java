package br.com.aluraminhasmusicas.principal;

import br.com.aluraminhasmusicas.modelos.MinhasPreferidas;
import br.com.aluraminhasmusicas.modelos.Musica;
import br.com.aluraminhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
            
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
            
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();            
        }

        for (int i = 0; i < 1000 ; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.indlui(meuPodcast);
        preferidas.indlui(minhaMusica);


    }
}
