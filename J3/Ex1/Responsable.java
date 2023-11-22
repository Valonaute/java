package J3.Ex1;

import java.util.ArrayList;

public class Responsable extends Employe {
    
    public 


    public ArrayList <Employe> listeEmployesSubordonnes;

    public Responsable(int matricule, String name, indiceSalarial){
        super(matricule, name, indiceSalarial)
    };
    public void ajouterEmployeSubordonne(String name, int matricule, int indiceSalarial){
        Employe employeSubordonne = new Employe(name, matricule, indiceSalarial); 

        listeEmployesSubordonnes.add(employeSubordonne);
    }
}
