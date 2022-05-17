package be.technifutur;

public class DeathStar {
    public void attireVaisseau(VaisseauAncetre vaisseauAncetre) {
        if (vaisseauAncetre instanceof VaisseauRebel) {
            attireVaisseau((VaisseauRebel) vaisseauAncetre);
        } else if (vaisseauAncetre instanceof VaisseauEmpire) {
            attireVaisseau((VaisseauEmpire) vaisseauAncetre);

        } else {
            vaisseauAncetre.atterir();
            vaisseauAncetre.afficheCamp();
            vaisseauAncetre.decoller();
        }
        vaisseauAncetre.atterir();
        vaisseauAncetre.afficheCamp();
        vaisseauAncetre.decoller();

    }

    public void attireVaisseau(VaisseauEmpire vaisseauEmpire) {
        vaisseauEmpire.atterir();
        vaisseauEmpire.afficheCamp();
        vaisseauEmpire.messageDarkVador("A vos ordres");
    }

    public void attireVaisseau(VaisseauRebel vaisseauRebel) {
        vaisseauRebel.atterir();
        vaisseauRebel.afficheCamp();
        System.out.println("A l'aide ObyWan");
        vaisseauRebel.decoller();
    }
}
