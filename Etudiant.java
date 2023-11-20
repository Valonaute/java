public class Etudiant {
    private String nom = "";
    private String prenom = "";
    private int numEtudiant = 0;

    public Etudiant(String nom, String prenom, int numEtudiant){
        this.nom = nom;
        this.prenom = prenom; 
        this.numEtudiant = numEtudiant;
    }

    public void afficherDetails (){
        System.out.println(nom + " " + prenom + " Numéro Etudiant : " + numEtudiant);
    }

    public Float calculerMoyenne(int[] notes){
        Float sum = 0.0f;

        for (int i = 0; i < notes.length; i++){
            sum += notes[i];
        }

        Float moyenne = sum/(notes.length); 

        return moyenne;
    }
}
