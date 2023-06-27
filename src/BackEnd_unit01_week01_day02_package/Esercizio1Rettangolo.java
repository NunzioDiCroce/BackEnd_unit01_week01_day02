package BackEnd_unit01_week01_day02_package;

public class Esercizio1Rettangolo {
	
	// proprietà
	int altezza;
	int larghezza;
	
	// costruttore
	public Esercizio1Rettangolo(int _altezza, int _larghezza) {
		this.altezza = _altezza;
		this.larghezza = _larghezza;
		
	}
	
	// metodi
	public static int metodoPerimetro(int _altezza, int _larghezza) {
		int perimetro = _altezza*2 + _larghezza*2;
		return perimetro;
	}
	
	public static int metodoArea(int _altezza, int _larghezza) {
		int area = _altezza*_larghezza;
		return area;
	}
	
}
