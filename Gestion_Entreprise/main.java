package Gestion_Entreprise;
public class main {
	
	    public static void main(String[] args) {
	        
	        Employe employe1 = new Employe(123456, "Ghaith", 300.0, 1);
	        Employe employe2 = new Employe(789012, "yessin", 350.0, 2);
	        Employe employe3 = new Employe(345678, "Hamadi", 310.0, 3);
	        Employe employe4 = new Employe(901234, "Rayen", 380.0, 4);

	        
	        Departement departement1 = new Departement(1);
	        Departement departement2 = new Departement(2);
	        departement1.ajoutEmploye(employe1);
	        departement2.ajoutEmploye(employe2);
	        departement1.ajoutEmploye(employe3);
	        departement2.ajoutEmploye(employe4);

	        
	        Entreprise entreprise = new Entreprise("BTS");
	        entreprise.ajoutDep(departement1);
	        entreprise.ajoutDep(departement2);
	        entreprise.affiche();

	       
	        employe1.setSalaire(400.0); 
	        entreprise.UpdateDep(employe1, 2);

	        
	        System.out.println("Après transfert de l'employé:");
	        entreprise.affiche();
	        entreprise.DepMinCapacity();
	    }
	}



