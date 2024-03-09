package Gestion_Entreprise;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Entreprise {
	private String nomEntreprise; 
	 HashMap<Integer, Departement> Liste_Deps;
	 
	public Entreprise(String nomEntreprise) {
		this.setNomEntreprise(nomEntreprise);
		Liste_Deps=new HashMap<>();
		
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	} 
	public void ajoutDep(Departement d) {
		Liste_Deps.put(d.getIdDep(), d);
		
	}
	public void retirerDep(Departement d) {
		Liste_Deps.remove(d.getIdDep(),d);
	}

	        public boolean existeD(Departement d) { 
	        	Liste_Deps.containsKey(d.getIdDep());
	            Liste_Deps.containsValue(d);
	            return true;
	            
	           }
	        public void affiche() {
	        	Set<Integer> lk=Liste_Deps.keySet();
	        	for(Integer id:lk) {
	        		System.out.println(id+":"+Liste_Deps.get(id));
	        	}}
	        
//public void affiche() {
	//Set<Entry<Integer,Departement>> ld=new Liste_Deps.entrySet();
	        //for(Entry<Integer,Departement> e:Liste_Deps) {
	        //system.out.println(e.getKey()+":"+e.getValue());
	        //}
	        public void UpdateDep(Employe e, int idDep) {
	            Departement ad = null;
	            for (Departement departement : Liste_Deps.values()) {
	                if (departement.existeE(e.getCin())) {
	                    ad = departement;
	                    
	                }
	            }
	            if (ad != null) {
	                ad.retirerEmploye(e);
	                Departement nouveauDepartement = Liste_Deps.get(idDep);
	                if (nouveauDepartement != null) {
	                    nouveauDepartement.ajoutEmploye(e);
	                }
	            }
	        }

	        public void DepMinCapacity() {
	            int mc = Integer.MAX_VALUE;
	            Departement mcDept = null;
	            for (Departement departement : Liste_Deps.values()) {
	                if (departement.getLEmployes().size() < mc) {
	                	mc = departement.getLEmployes().size();
	                	mcDept = departement;
	                }  
	            }
	            if (mcDept != null) {
	                System.out.println("Département avec le moins d'employés:");
	                mcDept.afficheDep();
	            } 
	        }
	    }

	        		



	        


