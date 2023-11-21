import java.util.ArrayList;

public class Bibliotheque {

   public ArrayList <Livre> listeLivres = new ArrayList<>();  

   public void ajouterLivre(String titre , String auteur , int anneePublication){
      Livre book = new Livre(titre, auteur, anneePublication);
      listeLivres.add(book);
   };

   public void afficherDetails(){
      for(int i = 0; i < listeLivres.size(); i++){
         Livre livre = listeLivres.get(i);
         livre.afficherLivre();
      }
   }
}
