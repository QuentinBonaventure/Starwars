package be.technifutur;

public abstract class Empire extends Personnage {
    public Empire(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis dans le camp des méchants je veux tuer du jedi");
    }
}
