package Project;

public class Canzone extends FileMultimediale {
	private int durata;
	private String artista;

	public Canzone(String titolo, int durata, String artista) {
		super(titolo);
		this.durata = durata;
		this.artista = artista;
	}

	public void mostraDurata() {
		System.out.println("Durata della canzone: " + durata + " secondi");
	}

	public void mostraArtista() {
		System.out.println("Artista: " + artista);
	}

	public void mostraDettagli() {
		System.out.println("Dettagli della canzone...");
		// Altri dettagli specifici della canzone
	}

	public void mostraInfoCompleta() {
		System.out.println("Titolo: " + getTitle());
		System.out.println("Durata: " + durata + " secondi");
		System.out.println("Artista: " + artista);
		System.out.println("Dettagli: ...");
		// Altri dettagli specifici della canzone
	}

	@Override
	public void play() {
		System.out.println("Riproduzione della canzone: " + getTitle());
		// Logica di riproduzione della canzone
	}
}
