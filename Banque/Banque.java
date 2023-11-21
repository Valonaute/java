package Banque;
import java.util.ArrayList;

public class Banque {
    
    public ArrayList <CompteBancaire> listeCompteBancaire = new ArrayList<>(); 

    public void ajouterCompteBancaire(String titulaire, int solde){
        CompteBancaire compte = new CompteBancaire(titulaire, solde); 
        listeCompteBancaire.add(compte);
    }

    public void afficherListe(){
        for(int i = 0; i < listeCompteBancaire.size(); i++){
            CompteBancaire compte = listeCompteBancaire.get(i);
            compte.afficherDetails();
        }
    }

}
