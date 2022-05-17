package be.technifutur;

public class Vaisseau {
    public String nom;
    public int nbMissiles;

    public Vaisseau() {
    }

    public void tirerMissile() {
        if (this.nbMissiles > 0) {
            System.out.println("PAN");
            --this.nbMissiles;
        } else {
            System.out.println("POUF");
        }

    }
}
