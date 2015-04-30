package gestionemerende;

public class Articolo {
	private String ID;
	private double costoUnitario;
	private String descrizione;
	private double apportoCalorico;
	
	public Articolo(String ID, double costoUnitario, String descrizione,
			double apportoCalorico) {
		if(ID!=null)
			this.ID = ID;
		else
			throw new IllegalArgumentException("ID è null");
		
		if(costoUnitario>0)
			this.costoUnitario = costoUnitario;
		else
			throw new IllegalArgumentException("costoUnitario deve essere maggiore di 0");
			
		if(descrizione!=null)
			this.descrizione = descrizione;
		else
			throw new IllegalArgumentException("descrizione è null");
		
		if(apportoCalorico>0)
			this.apportoCalorico = apportoCalorico;
		else
			throw new IllegalArgumentException("l'apporto calorico deve essere maggiore di 0");
	}

	public String getID() {
		return ID;
	}

	public double getCostoUnitario() {
		return costoUnitario;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public double getApportoCalorico() {
		return apportoCalorico;
	}

	@Override
	public String toString() {
		return "Articolo [ID=" + ID + ", costoUnitario=" + costoUnitario
				+ ", descrizione=" + descrizione + ", apportoCalorico="
				+ apportoCalorico + "]";
	}

}
