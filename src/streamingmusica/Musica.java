package streamingmusica;

public class Musica {

	private String titulo;
	private String artista;
	private String album;
	private int duracaoEmSegundos;
	private int idadeMinima;

	public Musica(String titulo, String artista, String album,
			int duracaoEmSegundos, int idadeMinima) {
		setTitulo(titulo);
		setArtista(artista);
		setAlbum(album);
		setDuracaoEmSegundos(duracaoEmSegundos);
		setIdadeMinima(idadeMinima);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getDuracaoEmSegundos() {
		return duracaoEmSegundos;
	}

	public void setDuracaoEmSegundos(int duracaoEmSegundos) {
		this.duracaoEmSegundos = duracaoEmSegundos;
	}

	public int getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

}
