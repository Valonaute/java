public class Rectangle implements FormeGeometrique{
    
    public double largeur = 0;
    public double longueur = 0;

    public Rectangle(double largeur, double longueur){
        this.largeur = largeur;
        this.longueur = longueur; 
    }

    @Override
    public double calculerPerimetre() {
        double perimetre = (2*largeur + 2*longueur);
        return perimetre;
    }

    @Override
    public double calculerSurface() {
        double surface = (largeur*longueur);
        return surface;
    }

    @Override
    public void afficherInformations() {
        System.out.println("Largeur : "+ largeur + " cm");
        System.out.println("Longueur : "+ longueur + " cm");
        System.out.println("Perimetre : "+ calculerPerimetre() + " cm");
        System.out.println("Surface : "+ calculerSurface() + " cm²");
    }



}
