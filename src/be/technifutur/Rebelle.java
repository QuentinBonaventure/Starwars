package be.technifutur;

public  abstract class Rebelle extends Personnage{


    public Rebelle(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis dans le clan des gentils");
    }



}
