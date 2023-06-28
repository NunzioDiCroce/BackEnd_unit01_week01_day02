package BackEnd_unit01_week01_day02_package;

import java.util.Scanner;

public class Esercizio3Main {

	// main
	public static void main(String[] args) {

		// - - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -
		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");

		System.out.println("Inserire dati cliente");

		Scanner esercizioTre = new Scanner(System.in);

		System.out.println("Nome");
		String nome = esercizioTre.nextLine();
		System.out.println("Cognome");
		String cognome = esercizioTre.nextLine();
		System.out.println("Mail");
		String mail = esercizioTre.nextLine();

		String codiceCliente = "000112233";
		String data = "28 Giugno 2023";

		Esercizio3Cliente cliente = new Esercizio3Cliente(codiceCliente, nome, cognome, mail, data);

		System.out.println("");
		System.out.println("Gentile " + cliente.nomeCliente + " " + cliente.cognomeCliente + " ( mail: "
				+ cliente.mailCliente + " )" + " seleziona 3 articoli");
		System.out.println("");

		System.out.println("Codice primo articolo");
		String codice1 = esercizioTre.nextLine();
		String descrizione1 = "Questo è un articolo";
		double prezzo1 = 100.00;
		System.out.println("Codice secondo articolo");
		String codice2 = esercizioTre.nextLine();
		String descrizione2 = "Questo è un articolo";
		double prezzo2 = 150.55;
		System.out.println("Codice terzo articolo");
		String codice3 = esercizioTre.nextLine();
		String descrizione3 = "Questo è un articolo";
		double prezzo3 = 180.88;

		Esercizio3Articolo[] arrayArticoli = new Esercizio3Articolo[3];
		arrayArticoli[0] = new Esercizio3Articolo(codice1, descrizione1, prezzo1);
		arrayArticoli[1] = new Esercizio3Articolo(codice2, descrizione2, prezzo2);
		arrayArticoli[2] = new Esercizio3Articolo(codice3, descrizione3, prezzo3);
		double sommaPrezzo = arrayArticoli[0].prezzoArticolo + arrayArticoli[1].prezzoArticolo
				+ arrayArticoli[2].prezzoArticolo;

		Esercizio3Carrello carrello = new Esercizio3Carrello(codiceCliente, arrayArticoli, sommaPrezzo);

		System.out.println("");
		System.out.println("Codice cliente: " + carrello.codiceCliente + " | Articoli selezionati: "
				+ carrello.elencoArticoli[0].codiceArticolo + ", " + carrello.elencoArticoli[1].codiceArticolo + ", "
				+ carrello.elencoArticoli[2].codiceArticolo + " | Totale: " + carrello.totaleCostoArticoli + "€");

		esercizioTre.close();

	}

}
