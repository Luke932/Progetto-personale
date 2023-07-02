package Project;

public class Immagine extends FileMultimediale {
	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	public void aumentaLuminosita() {
		luminosita++;
	}

	public void diminuisciLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}
	}

	public void mostraLuminosita() {
		System.out.println("Livello di luminosità: " + luminosita);
	}

	public void mostraInfoCompleta() {
		System.out.println("Titolo: " + getTitle());
		System.out.println("Livello di luminosità: " + luminosita);
		// Altri dettagli specifici dell'immagine
	}

	@Override
	public void play() {
		System.out.println("Visualizzazione dell'immagine: " + getTitle());
		// Logica di visualizzazione dell'immagine
	}
}
