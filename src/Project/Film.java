package Project;

public class Film extends FileMultimediale {
	private int durata;
	private String regista;

	public Film(String titolo, int durata, String regista) {
		super(titolo);
		this.durata = durata;
		this.regista = regista;
	}

	public void mostraDurata() {
		System.out.println("Durata del film: " + durata + " minuti");
	}

	public void mostraRegista() {
		System.out.println("Regista: " + regista);
	}

	public void mostraDettagli() {
		System.out.println("Dettagli del film...");
		// Altri dettagli specifici del film
	}

	public void mostraInfoCompleta() {
		System.out.println("Titolo: " + getTitle());
		System.out.println("Durata: " + durata + " minuti");
		System.out.println("Regista: " + regista);
		System.out.println("Dettagli: ...");
		// Altri dettagli specifici del film
	}

	@Override
	public void play() {
		System.out.println("Riproduzione del film: " + getTitle());
		// Logica di riproduzione del film
	}
}
