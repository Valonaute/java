public class MainAnimal {
  
    public static void main(String[] args) {
        
        Oiseau O = new Oiseau("Héron", 3, "Mâle", "Grandes plumes");

        O.afficherInfos();
        O.voler();

        Mammifere L = new Mammifere("Lauriane", 26, "Femelle", "Poils");

        L.afficherInfos();
        L.allaiter();
    }
}
