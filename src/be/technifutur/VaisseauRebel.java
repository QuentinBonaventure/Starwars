package be.technifutur;

public class VaisseauRebel extends VaisseauAncetre {

    public VaisseauRebel(String nom) {
        super(nom);
    }

    @Override
    public void afficheCamp() {
        System.out.println("je suis un rebel");
    }

    public void messageR2D2(String message) {
        System.out.println("Biiiipppp biiiiip");
    }
}
