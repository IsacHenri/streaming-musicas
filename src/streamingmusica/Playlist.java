package streamingmusica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String titulo;
	private List<Musica> musicas = new ArrayList<>();

	public Playlist(String titulo, Musica musica) {
		setTitulo(titulo);
		this.addMusica(musica);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Musica> getMusicas() {
		return new ArrayList<>(musicas);
	}

	public void addMusica(Musica musica) {
		musicas.add(musica);
	}

	public void removeMusica(Musica musica) {
		if (musicas.size() > 1) {
			musicas.remove(musica);
		}
	}

	public int getIdadeMinima() {
		int maiorIdadeMinima = musicas.get(0).getIdadeMinima();
		for (int i = 1; i < musicas.size(); i++) {
			if (musicas.get(i).getIdadeMinima() > maiorIdadeMinima) {
				maiorIdadeMinima = musicas.get(i).getIdadeMinima();
			}
		}
		return maiorIdadeMinima;
	}

	public int getDuracaoTotalEmSegundos() {
//		musicas
//			.stream()
//			.map(Musica::getDuracaoEmSegundos)
//			.reduce((a,b) -> a + b);
		int duracaoTotal = 0;
		for (Musica musica : musicas) {
			duracaoTotal += musica.getDuracaoEmSegundos();
		}
		return duracaoTotal;
	}

}
