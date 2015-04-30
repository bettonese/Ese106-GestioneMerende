package gestionemerende;
import java.util.*;

public class Ordine {
	private double costoTotale;
	private Classe classe;
	private Vector<Articolo> articoli;
	private String ID;
	
	public Ordine(String ID){
		if(ID!=null)
			this.ID = ID;
		else
			throw new IllegalArgumentException("ID è null");
		
		this.articoli=new Vector<Articolo>();
	}
	
	public String getID() {
		return ID;
	}
	
	public Classe getClasse() {
		return classe;
	}
	
	public void setClasse(Classe classe) {
		if(classe!=null)
			this.classe = classe;
		else
			throw new IllegalArgumentException("classe è null");
	}
	
	public double getCostoTotale() {
		costoTotale=0;
		for(int i=0; i<this.articoli.size();i++)
			costoTotale+=this.articoli.elementAt(i).getCostoUnitario();
		
		return costoTotale;
	}
	
	public Vector<Articolo> getArticoli() {
		return articoli;
	}
	
	public void addArticolo(Articolo a) {
		if(a != null)
			articoli.add(a);
		else
			throw new IllegalArgumentException("l'articolo non può essere null ");
	}
	
	public int getNumeroArticoli() {
		return articoli.size();
	}

}
