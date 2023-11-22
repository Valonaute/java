package J3.Ex1;

public class Commercial extends Employe {
    
    private int nbVente;
    private int comParVente; 

    public Commercial(String name, int matricule, int indiceSalarial, int nbVente){
        super(name, matricule, indiceSalarial);
        this.nbVente = nbVente; 
        this.comParVente = 10;
    }

    public int salaire(){
        
    }
}
