public class Mammifere extends Animal {
    String typeDeFourrure = "";

    public Mammifere(String nom, int age, String sexe, String typeDeFourrure){
        super(nom, age, sexe);
        this.typeDeFourrure = typeDeFourrure;
    }

    public void allaiter(){
        System.out.println("J'allaite");
    }
}
