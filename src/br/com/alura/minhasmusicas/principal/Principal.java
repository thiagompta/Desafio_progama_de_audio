package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica musica = new Musica();
        musica.setTitulo("Balada Boa");
        musica.setCantor("Gusttavo Lima");
        musica.setAlbum("Paraiso Particular");
        musica.setGenero("Sertanejo");

        for(int i = 0; i < 1000; i++){
            musica.reproduz();
        }
        for(int i = 0; i < 50; i++){
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setApresentador("Leon S. Kennedy");
        podcast.setTitulo("Os misterios de se criar um bom titulo");
        podcast.setDescricao("Exemplo de descrição do podcast");

        for (int i = 0; i< 5000; i++ ){
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++){
            podcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(musica);
        preferidas.inclui(podcast);
    }
}
