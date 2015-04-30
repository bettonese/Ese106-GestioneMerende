package gestionemerende;

public class Panino extends Articolo{
	private boolean vegetariano;
	private boolean carneSuina;
	public Panino(String ID, double costoUnitario, String descrizione, double apportoCalorico, boolean vegetariano, boolean carneSuina){
		super(ID, costoUnitario, descrizione, apportoCalorico);
		if(!vegetariano && !carneSuina){
			this.vegetariano = vegetariano;
			this.carneSuina = carneSuina;
		}
		else{
			throw new IllegalArgumentException(" ");
			
		}
			
	}
	public boolean isVegetariano() {
		return vegetariano;
	}
	public boolean isCarneSuina() {
		return carneSuina;
	}

}
