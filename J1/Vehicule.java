public class Vehicule {
    
    String marque = "";
    String modele = "";
    String categorie = "";
    
    public Vehicule(String marque, String modele, String categorie){

        this.marque = marque;
        this.modele = modele; 
        this.categorie = categorie;

    }

    public void afficherCategorie(){
        System.out.println("Catégorie du véhicule " + categorie);
    }

    public static void main(String[] args) {
        
        
        
    }



}
