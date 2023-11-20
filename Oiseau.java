public class Oiseau extends Animal{
    
    String typeDePlumage = "";

    public Oiseau(String nom, int age, String sexe, String typeDePlumage){
        super(nom, age, sexe);
        this.typeDePlumage = typeDePlumage;
    }

    public void voler(){
        System.out.println("Je suis en train de voler");
    }
}
