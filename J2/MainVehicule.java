package J2;

public class MainVehicule {
    
    public static void main(String[] args) {
        
        Voiture Scenic = new Voiture();

        Scenic.demarrer();
        ;
        Scenic.afficherVitesse(Scenic.accelerer(Scenic.accelerer(0)));
        Scenic.eteindreLeMoteur();

    }
}
