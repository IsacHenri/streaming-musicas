package streamingmusica;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private List<Playlist> playlists = new ArrayList<>();
	
	public Usuario(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
	
}
