package Banque;

public class CompteBancaire {
    
    String numeroCompte = "FRXX00000";
    String titulaire = "";
    int solde = 0;

    public CompteBancaire(String titulaire, int solde){
        char initiale = titulaire.charAt(0);
        this.numeroCompte = "FR" + initiale + "00001";
        this.titulaire = titulaire; 
        this.solde = solde; 
    }

    public void afficherDetails(){
        System.out.println("Numéro de compte : "+ numeroCompte);
        System.out.println("Titulaire du compte : "+ titulaire);
        System.out.println("Solde du compte : "+ solde + " Euros");
    }

    public void depot(int montant){
        solde += montant; 
        System.out.println("Vous avez depose : "+ montant + " Euros");
        System.out.println("Votre solde est de : "+ solde + " Euros");
    }

    public void retrait(int montant){
        solde -= montant; 
        System.out.println("Vous avez retire : "+ montant + " Euros");
        System.out.println("Votre solde est de : "+ solde + " Euros");
    }

}
