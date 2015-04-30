package gestionemerende;
import java.util.*;
public class Classe {
	
	private String nome;
	private Vector<Ordine> ordini;

	public Classe(String nome) {
		if(nome!=null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("nome è null");
		
		this.ordini = new Vector<Ordine>();
	}

	public String getNome() {
		return nome;
	}

	public Vector<Ordine> getOrdini() {
		return ordini;
	}
	
	public void addOrdine(Ordine o) throws Exception{
		if(o!=null){
			for(int i=0;i<this.ordini.size();i++){
				if(this.ordini.elementAt(i).getID().equals(o.getID()))
					throw new IllegalArgumentException("Ordine presente");
			}
			ordini.addElement(o);
			o.setClasse(this);
		}
		else
			throw new IllegalArgumentException("o cannot be null");
		
	}

}
