package J2.Banque;

public class MainBanque {
    
    public static void main(String[] args) {
        
        Banque liste = new Banque();

        liste.ajouterCompteBancaire("Valentin", 500);
        liste.ajouterCompteBancaire("Lauriane", 8500);

        liste.afficherListe();


    }
}
