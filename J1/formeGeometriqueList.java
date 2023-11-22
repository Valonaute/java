import java.util.ArrayList;

public class formeGeometriqueList {
    
    public ArrayList <FormeGeometrique> listeFormes = new ArrayList<>();

    public void ajouterCercle(double rayon){
        FormeGeometrique forme = new Cercle(rayon);
        listeFormes.add(forme);
    }

    public void ajouterRectangle(double largeur, double longueur){
        FormeGeometrique forme = new Rectangle(largeur, longueur);
        listeFormes.add(forme);
    }

    public void afficherDetails(){
        for(int i = 0; i < listeFormes.size(); i++){
            FormeGeometrique forme = listeFormes.get(i);
            forme.afficherInformations();
        }
    }
}
