package Gestion_Entreprise;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Departement {
    private int idDep;
    private Set<Employe> LEmployes;

    public Departement(int idDep) {
        this.idDep = idDep;
        this.LEmployes = new HashSet<>();
    }

    public void ajoutEmploye(Employe e) {
        if (e.getCin() > 0) {
            e.setId_Dep(idDep);
            LEmployes.add(e);
        }
    }

    public void retirerEmploye(Employe employe) {
        LEmployes.remove(employe);
    }

    public void afficheDep() {
        System.out.println("Département ID: " + idDep);
        System.out.println("Liste des employés:");
        for (Employe employe : LEmployes) {
            System.out.println(employe.toString());
        }
    }
    public boolean existeE(int cin) { 
        LEmployes.contains(new Employe(123,null,null, cin));
        return true;
       }


public Employe getEmpSalMax() { 
	TreeSet<Employe> es = new TreeSet<>((e1, e2)-> Double.compare(e2.getSalaire(), e1.getSalaire()));
	es.addAll(LEmployes);
	if (!es.isEmpty()) {
	    return es.first();
	} else {
		return null;
}
	}

@Override
public String toString() {
	return "Departement [idDep=" + idDep + ", LEmployes=" + LEmployes + "]";
}

public int getIdDep() {
	return idDep;
}

public void setIdDep(int idDep) {
	this.idDep = idDep;
}

public Set<Employe> getLEmployes() {
	return LEmployes;
}

public void setLEmployes(Set<Employe> lEmployes) {
	LEmployes = lEmployes;
}

}


