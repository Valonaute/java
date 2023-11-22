public class Cercle implements FormeGeometrique {
    public double rayon = 0.0f;

    public Cercle(double rayon){
        this.rayon = rayon;
    }

    @Override
    public double calculerPerimetre() {
        double perimetre = (2*3.1415*rayon);
        return perimetre;
    }

    @Override
    public double calculerSurface() {
        double surface = (rayon*rayon)*3.1415;
        return surface;
    }

    public void afficherInformations() {
        System.out.println("Rayon du cercle : "+ rayon + " cm");
        System.out.println("Surface du cercle : " + calculerSurface() + " cm²");
        System.out.println("Perimetre du cercle : "+ calculerPerimetre() + " cm");        
    }

}
