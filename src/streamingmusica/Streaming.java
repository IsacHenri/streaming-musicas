package streamingmusica;

import java.util.ArrayList;
import java.util.List;

public class Streaming {

	private List<Usuario> usuarios = new ArrayList<>();
	private List<Playlist> playlists = new ArrayList<>();
	private List<Musica> musicas = new ArrayList<>();
	
	public List<Usuario> getUsuarios() {
		return new ArrayList<>(usuarios);
	}

	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public void removeUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
	
	public List<Playlist> getPlaylists() {
		return new ArrayList<>(playlists);
	}
	
	public void addPlaylist(Playlist playlist) {
		playlists.add(playlist);
	}
	
	public void removePlaylist(Playlist playlist) {
		playlists.remove(playlist);
	}
	
	public List<Musica> getMusicas() {
		return new ArrayList<>(musicas);
	}

	public void addMusica(Musica musica) {
		musicas.add(musica);
	}

	public void removeMusica(Musica musica) {
		musicas.remove(musica);
	}
	
	public List<Musica> buscarMusicaPorTituloOuArtista(String texto) {
		List<Musica> filtradas = new ArrayList<>();
		for(Musica musica: musicas) {
			if(musica.getArtista().contains(texto) ||
					musica.getTitulo().contains(texto)) {
				filtradas.add(musica);
			}
		}
		return filtradas;
	}
	
}
