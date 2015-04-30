package gestionemerende;
import java.util.*;

public class Istituto {
	private String nome;
	private Vector<Classe> classi;
	
	public Istituto(String nome) {
		if(nome != null)
			this.nome = nome;
		else
			throw new IllegalArgumentException("nome non valido");
		this.classi = new Vector<Classe>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public Vector<Classe> getClassi(){
		return classi;
	}
	
	public void addClasse(Classe c){
		if(c!=null)
			classi.add(c);
		else
			throw new IllegalArgumentException("Classe non valida");
	}	

}
