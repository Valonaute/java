import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        // Créer une boucle de saisie 
        boolean wantPlay = true; 
        int score = 0;

        while (wantPlay){

            // Explication du jeu 
            System.out.println("Donnez des mot palindrome. Un point par bonne réponse. -1 Point par réponse fausse. Vous gagner à 3 points.");
            // Saisie du mot
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez saisir un mot palindrome : ");
            String mot = scanner.nextLine();

            // Inverser le mot 
            String motInverse = "";
            for (int i = mot.length() - 1; i >= 0; i--) {
                motInverse += mot.charAt(i);
            }

            // On met les mots en minuscule 
            String motMinuscule = mot.toLowerCase();
            String motInverseMinuscule = motInverse.toLowerCase();

            // Comparer les mots 
            if (motMinuscule.equals(motInverseMinuscule)) {
                System.out.println("Le mot est un palindrome.");
                score += 1;
            } else {
                System.out.println("Le mot n'est pas un palindrome.");
                score -= 1;
            }

            System.out.println("Le score est de " + score + "points");

            if(score == 3){
                System.out.println("Bravo vous avez gagné !");
                Scanner scannerWantPlay = new Scanner(System.in);
            System.out.println("Voulez-vous continuer ? (y/n) ");
            String motWantPlay = scannerWantPlay.nextLine();
            scannerWantPlay.close();

                if(motWantPlay.equals("y")){
                    wantPlay = true;
                } else {
                    wantPlay = false;
                }
                
            } else {
                System.out.println("Continuez vous n'avez pas encore gagné !");
            }

            scanner.close();
            
        }
    }
}
