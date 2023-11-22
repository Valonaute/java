package J3.Pokemon;

public class Pokemon {
    private String nom; 
    private int hp; 
    private int atk; 
    

    public Pokemon (String nom, int hp, int atk){
        this.nom = nom; 
        this.hp = hp; 
        this.atk = atk; 
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public boolean isDead(){
        if(hp > 0){
            return false; 
        } else {
            return true; 
        }
    }

    public void attaquer(Pokemon p){
        System.out.println("Le pokemon " + this.nom + " avec " + this.hp + " HP attaque " + p.nom + " qui a actuellement " + p.hp + " HP");
        p.hp -= this.atk;
        System.out.println("Le pokemon " + this.nom + " a " + this.hp + " HP. " + p.nom + " qui a maintenant " + p.hp + " HP");
        if(p.isDead()){
            System.out.println("Le pokemon "+ p.nom + " est mort");
        }
    }

    @Override
    public String toString() {
        
        return "Pokemon nom : "+nom+", HP : "+hp+" PV, Attaque : "+atk;
    }
}
