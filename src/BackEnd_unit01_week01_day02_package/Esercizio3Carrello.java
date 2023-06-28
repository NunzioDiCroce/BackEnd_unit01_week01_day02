package BackEnd_unit01_week01_day02_package;

public class Esercizio3Carrello {

	// proprietà
	String codiceCliente;
	Esercizio3Articolo[] elencoArticoli;
	double totaleCostoArticoli;

	// costruttore
	public Esercizio3Carrello(String _codiceCliente, Esercizio3Articolo[] _elencoArticoli,
			double _totaleCostoArticoli) {
		this.codiceCliente = _codiceCliente;
		this.elencoArticoli = _elencoArticoli;
		this.totaleCostoArticoli = _totaleCostoArticoli;
	}

}
