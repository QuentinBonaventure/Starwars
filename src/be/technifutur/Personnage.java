package be.technifutur;

public abstract class Personnage {
     private final  String nom;


    public Personnage(String nom){
        this.nom = nom;
    }


    // Constructor qui prend nom en param

    public  abstract void afficheCamp();
    public abstract void combattre();
    public  String getNom(){
        return nom;
    }
}
