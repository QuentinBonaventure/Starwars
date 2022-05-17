package be.technifutur;

public class VaisseauSecurise {
    private String nom = " Vaisseau sans nom pour démontstration du if du constructeur";
    private int nbMissiles;
    private boolean enVol;
    public static int nbEnVol;

    public VaisseauSecurise(String nom) {
        if (nom != null && nom.trim().length() > 0) {
            this.nom = nom;
        }

    }

    public void tirerMissile() {
        if (this.nbMissiles > 0) {
            System.out.println("PAN");
            --this.nbMissiles;
        } else {
            System.out.println("POUF");
        }

    }

    public boolean addMissiles(int nbMissiles) {
        boolean ajouté = false;
        if (nbMissiles > 0) {
            this.nbMissiles += nbMissiles;
        }

        return ajouté;
    }

    public int getNbMissiles() {
        return this.nbMissiles;
    }

    public boolean removeMissiles(int nbMissiles) {
        boolean supprimé = false;
        if (nbMissiles > 0 && nbMissiles <= this.nbMissiles) {
            this.nbMissiles -= nbMissiles;
            supprimé = true;
        }

        return supprimé;
    }

    public void decoller() {
        if (!this.enVol) {
            System.out.printf("Le vaisseau %s décolle %n", this.nom);
            this.enVol = true;
            ++nbEnVol;
        } else {
            System.out.println("Le vaisseau " + this.nom + " est déjà en vol");

        }

    }

    public void atterir() {
        boolean enVol;
        if (this.enVol) {
            System.out.println("Le vaisseau " + this.nom + " attérit");
            enVol = false;
            --nbEnVol;
        } else {
            System.out.println("Le vaisseau" + this.nom + " est déjà au sol");
            enVol = true;
        }

    }

    public static int getNbEnVol() {
        return nbEnVol;
    }
}
