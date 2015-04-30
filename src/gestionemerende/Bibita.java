package gestionemerende;

public class Bibita extends Articolo{
	private double quantita;
	
	public Bibita(String ID, double costoUnitario, String descrizione,
			double apportoCalorico, double quantita) {
		super(ID, costoUnitario, descrizione, apportoCalorico);
		if(quantita>0)
			this.quantita = quantita;
		else
			throw new IllegalArgumentException("la quantita deve essere maggiore di 0");
		// TODO Auto-generated constructor stub
	}

	public double getQuantita() {
		return quantita;
	}

}
