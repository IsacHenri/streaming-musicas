package streamingmusica;

public class Principal {

	public static void main(String[] args) {

		Streaming streaming = new Streaming();
		Usuario usuario = new Usuario("usuario1@gmail.com");
		Musica musica1 = new Musica("Musica 1", "Artista 1", "Álbum 1", 180, 12);
		Musica musica2 = new Musica("Musica 2", "Artista 1", "Álbum 1", 160, 12);
		Musica musica3 = new Musica("Faroeste Caboclo", "Artista 1", "Álbum 1",
				1800, 18);
		Playlist playlist = new Playlist("Playlist 1", musica1);
		playlist.addMusica(musica2);
		playlist.addMusica(musica3);
		usuario.addPlaylist(playlist);
		System.out.println(playlist.getDuracaoTotalEmSegundos());

	}

}
