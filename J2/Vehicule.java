package J2;

public abstract class Vehicule {
    String marque; 
    String modele; 

    abstract void eteindreLeMoteur();

    void demarrer(){
        System.out.println("VROUMMM le véhicule a demarrer !");
    }

    int accelerer(int vitesse){
        int vitesseAcceleree = (vitesse*2 + 10);
        return vitesseAcceleree;
    }

    void afficherVitesse(int vitesse){
        System.out.println(vitesse+" Km/h");
    }
}
