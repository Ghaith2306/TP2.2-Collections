package Gestion_Entreprise;

public class Employe {
	private int cin;
	private String nom;
	private Double salaire;
	private int id_Dep;
	
	public Employe(int cin, String nom, Double salaire, int id_Dep) {
		
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.id_Dep = id_Dep;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public int getId_Dep() {
		return id_Dep;
	}
	public void setId_Dep(int id_Dep) {
		this.id_Dep = id_Dep;
	}
	@Override
	public String toString() {
		return "Employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", id_Dep=" + id_Dep + "]";
	}

	

}
