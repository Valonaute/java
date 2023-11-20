public class Livre {
   private String titre = "";
   private String auteur = "";
   private int anneePublication = 0;

   public Livre(String t, String a, int ap){
    this.titre = t;
    this.auteur = a; 
    this.anneePublication = ap; 
   }

   public void afficherLivre(){
    System.out.println("Titre : " + titre);
    System.out.println("Auteur : " + auteur);
    System.out.println("Année de Publication : " + anneePublication);
   }

   
}
