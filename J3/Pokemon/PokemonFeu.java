package J3.Pokemon;

public class PokemonFeu extends Pokemon {
    
    private String type; 

    public PokemonFeu(String nom, int hp, int atk, String type){
        super(nom, hp, atk);
        this.type = type;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        
        return "Pokemon nom : "+nom+", HP : "+hp+" PV, Attaque : "+atk+", Type : "+type;
    }
}
