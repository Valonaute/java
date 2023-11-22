public class MainBibliotheque {
    
    public static void main(String[] args) {
        
        Bibliotheque biblio = new Bibliotheque();
        biblio.ajouterLivre("Walden", "Thoreau", 1965);
        biblio.ajouterLivre("La confiance en soi", "Emerson", 1849);
        biblio.ajouterLivre("La confiance", "Kennedy", 1949);

        biblio.afficherDetails();

    }
}
