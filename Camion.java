public class Camion extends Vehicule {
    int capaciteDeCharge = 0;

    public Camion(String marque, String modele, String categorie, int capaciteDeCharge) {
        super(marque, modele, categorie);
        this.capaciteDeCharge = capaciteDeCharge;
    }

    public void afficherCapaciteDeCharge (){
        System.out.println("La capacité de charge est de : " + capaciteDeCharge + " kilos.");
    }

    public void afficherCategorie(){
        System.out.println("Camion, il faut au moins le permis Poids lourds pour me conduire");
    }
}
