public class Animal {
    String nom = "";
    int age = 0;
    String sexe = "";

    public Animal(String nom, int age, String sexe){
        this.nom = nom; 
        this.age = age;
        this.sexe = sexe; 

    }

    public void afficherInfos(){
        System.out.println("Nom de l'animal : " + nom);
        System.out.println("Age de l'animal : " + age);
        System.out.println("Sexe de l'animal : " + sexe);
    }
}
