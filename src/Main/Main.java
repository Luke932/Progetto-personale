package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Project.Canzone;
import Project.FileMultimediale;
import Project.Film;
import Project.Immagine;

public class Main {
	private static List<FileMultimediale> library = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		library.add(new Film("Il signore degli anelli", 180, "Peter Jackson"));
		library.add(new Canzone("Bohemian Rhapsody", 360, "Queen"));
		library.add(new Immagine("Paesaggio", 50));

		int choice;
		do {
			System.out.println("Seleziona un elemento multimediale da riprodurre: ");
			for (int i = 0; i < library.size(); i++) {
				System.out.println((i + 1) + ". " + library.get(i).getTitle());
			}
			System.out.println("0. Esci");

			choice = scanner.nextInt();
			scanner.nextLine();

			if (choice >= 1 && choice <= library.size()) {
				FileMultimediale elemento = library.get(choice - 1);
				playElemento(elemento);
			} else if (choice != 0) {
				System.out.println("Scelta non valida");
			}
		} while (choice != 0);
	}

	public static void playElemento(FileMultimediale elemento) {
		elemento.play();

		if (elemento instanceof Film) {
			Film film = (Film) elemento;
			film.mostraDurata();
			film.mostraRegista();
			film.mostraDettagli();
			film.mostraInfoCompleta();
		} else if (elemento instanceof Canzone) {
			Canzone canzone = (Canzone) elemento;
			canzone.mostraDurata();
			canzone.mostraArtista();
			canzone.mostraDettagli();
			canzone.mostraInfoCompleta();
		} else if (elemento instanceof Immagine) {
			Immagine immagine = (Immagine) elemento;
			immagine.aumentaLuminosita();
			immagine.diminuisciLuminosita();
			immagine.mostraLuminosita();
			immagine.mostraInfoCompleta();
		}
	}
}
