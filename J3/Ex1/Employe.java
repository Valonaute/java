package J3.Ex1;

public class Employe {
    private String name;
    private int matricule;
    private int indiceSalarial; 
    
    private int baseSalaire = 100; 

    public Employe(String name, int matricule, int indiceSalarial){
        this.name = name; 
        this.matricule = matricule; 
        this.indiceSalarial = indiceSalarial; 
    }


    public int salaire(){
    return this.indiceSalarial*this.baseSalaire; 
    }

    public String getName(){
        return name; 
    }

    public void setName(String newName){
        name = newName; 
    }

    public int getMatricule(){
        return matricule; 
    }

    public void setMatricule(int newMatricule){
        matricule = newMatricule; 
    }

    public int getIndiceSalarial(){
        return indiceSalarial; 
    }

    public void setIndiceSalarial(int newIndiceSalarial){
        indiceSalarial = newIndiceSalarial; 
    }
}
