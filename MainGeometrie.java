import java.util.Scanner;

public class MainGeometrie {

    public static void main(String[] args) {
        
        formeGeometriqueList listeForme = new formeGeometriqueList();

        listeForme.ajouterCercle(1);
        listeForme.ajouterCercle(2);
        listeForme.ajouterCercle(3);
        listeForme.ajouterCercle(4);
        listeForme.ajouterCercle(5);
        listeForme.ajouterRectangle(1, 1);
        listeForme.ajouterRectangle(2, 2);
        listeForme.ajouterRectangle(3, 3);
        listeForme.ajouterRectangle(4, 4);
        listeForme.ajouterRectangle(5, 5);
        listeForme.ajouterRectangle(1, 2);
        listeForme.ajouterRectangle(1, 3);
        listeForme.ajouterRectangle(1, 4);
        listeForme.ajouterRectangle(1, 5);

        listeForme.afficherDetails();


        FormeGeometrique maForme; 

        // On récupère les infos 
        Scanner scannerRayon = new Scanner(System.in);
        System.out.println("Quel est le rayon du cercle ? ");
        double r = scannerRayon.nextDouble();
        maForme = new Cercle(r);

        maForme.afficherInformations();

        FormeGeometrique maFormeRectangle;

        Scanner scannerLargeur = new Scanner(System.in);
        System.out.println("Quel est la largeur du rectangle ? ");
        double largeur = scannerRayon.nextDouble();
        
        Scanner scannerLongueur = new Scanner(System.in);
        System.out.println("Quel est la longueur du rectangle ? ");
        double longueur = scannerRayon.nextDouble();

        maFormeRectangle = new Rectangle(largeur, longueur);

        maFormeRectangle.afficherInformations();

        scannerLargeur.close();
        scannerLongueur.close();
        scannerRayon.close();
    }
}