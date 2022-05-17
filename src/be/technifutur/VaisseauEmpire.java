package be.technifutur;

public class VaisseauEmpire extends VaisseauAncetre {
    public VaisseauEmpire(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("Je suis un vaisseau représentant l'empire ");
    }

    public void messageDarkVador(String message){
        System.out.println("Es tu mon père ?");
    }
}
