public class Main {

    public static void main(String[] args) {
        Voiture V = new Voiture("Subaru", "BRZ", "Leger", 3);

        V.afficherCategorie();
        V.afficherNombreDePlace();

        Camion C = new Camion("Toyota", "Cr100", "Lourd", 15000);

        C.afficherCategorie();
        C.afficherCapaciteDeCharge();
    }
}
