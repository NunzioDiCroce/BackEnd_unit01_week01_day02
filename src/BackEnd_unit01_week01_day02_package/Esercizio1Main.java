package BackEnd_unit01_week01_day02_package;

import java.util.Scanner;

public class Esercizio1Main {

	// main
	public static void main(String[] args) {

		// - - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -
		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");

		Scanner esercizioUno = new Scanner(System.in);

		System.out.println("Altezza primo rettangolo");
		String primaAltezza = esercizioUno.nextLine();
		int primaAltezzaInt = Integer.parseInt(primaAltezza);

		System.out.println("Larghezza primo rettangolo");
		String primaLarghezza = esercizioUno.nextLine();
		int primaLarghezzaInt = Integer.parseInt(primaLarghezza);

		Esercizio1Rettangolo primoRettangolo = new Esercizio1Rettangolo(primaAltezzaInt, primaLarghezzaInt);
		int primoPerimetro = primoRettangolo.metodoPerimetro(primaAltezzaInt, primaLarghezzaInt);
		int primaArea = primoRettangolo.metodoArea(primaAltezzaInt, primaLarghezzaInt);
		stampaRettangolo(primoPerimetro, primaArea);

		System.out.println("Altezza secondo rettangolo");
		String secondaAltezza = esercizioUno.nextLine();
		int secondaAltezzaInt = Integer.parseInt(secondaAltezza);

		System.out.println("Larghezza secondo rettangolo");
		String secondaLarghezza = esercizioUno.nextLine();
		int secondaLarghezzaInt = Integer.parseInt(secondaLarghezza);

		Esercizio1Rettangolo secondoRettangolo = new Esercizio1Rettangolo(secondaAltezzaInt, secondaLarghezzaInt);
		int secondoPerimetro = secondoRettangolo.metodoPerimetro(secondaAltezzaInt, secondaLarghezzaInt);
		int secondaArea = secondoRettangolo.metodoArea(secondaAltezzaInt, secondaLarghezzaInt);

		int sommaPerimetri = primoPerimetro + secondoPerimetro;
		int sommaAree = primaArea + secondaArea;

		stampaDueRettangoli(primoPerimetro, primaArea, secondoPerimetro, secondaArea, sommaPerimetri, sommaAree);

		esercizioUno.close();

	}

	public static void stampaRettangolo(int _perimetro, int _area) {
		System.out.println("Perimetro primo rettangolo: " + _perimetro + ", Area primo rettangolo: " + _area);
	}

	public static void stampaDueRettangoli(int _primoPerimetro, int _primaArea, int _secondoPerimetro, int _secondaArea,
			int _sommaPerimetri, int _sommaAree) {
		System.out.println("Perimetro primo rettangolo: " + _primoPerimetro + ", Area primo rettangolo: " + _primaArea);
		System.out.println(
				"Perimetro secondo rettangolo: " + _secondoPerimetro + ", Area secondo rettangolo: " + _secondaArea);
		System.out.println("Somma perimetri: " + _sommaPerimetri + ", Somma aree: " + _sommaAree);
	}

}
