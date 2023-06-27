package BackEnd_unit01_week01_day02_package;

public class Esercizio2Sim {
	
	// proprietà
	int numeroSim;
	int credito;
	Esercizio2Chiamata[] ultimeChiamate;
	
	// costruttore
	public Esercizio2Sim(int _numeroSim) {
		this.numeroSim = _numeroSim;
		this.credito = 0;
	}
	
	// metodi
	public static void stampaSim(int _numeroSim, int _credito, Esercizio2Chiamata[] _ultimeChiamate) {
		System.out.println("Numero Sim: " + _numeroSim + ", Credito: " + _credito + ", Ultime chiamate: " + _ultimeChiamate);
	}

}
