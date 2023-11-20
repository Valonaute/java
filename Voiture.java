public class Voiture extends Vehicule{
    int nombreDePlace = 0; 

    public Voiture(String marque, String modele, String categorie, int nombreDePlace){
        super(marque, modele, categorie);
        this.nombreDePlace = nombreDePlace;
    }

    public void afficherNombreDePlace (){
        System.out.println("Le nombre de places est de : " + nombreDePlace);
    }

    public void afficherCategorie(){
        System.out.println("Voiture, il faut au moins le permis B pour me conduire");
    }
}
