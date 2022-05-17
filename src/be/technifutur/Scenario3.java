package be.technifutur;

public class Scenario3 {
    public static void main(String[] args) {
        //VaisseauAncetre va = new VaisseauAncetre("Wing") ;
        VaisseauEmpire ve = new VaisseauEmpire("XWing");
        VaisseauRebel vr = new VaisseauRebel("Millenium");
        DeathStar deathStar = new DeathStar();

        ve.decoller();
        System.out.println(VaisseauAncetre.getNbEnVol());
        ve.atterir();
        System.out.println(VaisseauAncetre.getNbEnVol());
        ve.tirerMissile();
        VaisseauAncetre va2 = ve; // peut recevoir le truc de l'enfant mais pas l'inverse

        ve.messageDarkVador("help me");
        vr.messageR2D2("coucou");
        ve.afficheCamp();
        vr.afficheCamp();
        va2.afficheCamp(); // affiche empire car on lui a assigné l'adresse de ve
        ve.decoller();
        vr.decoller();

        System.out.println("--------------------------------");
        deathStar.attireVaisseau(ve);
        deathStar.attireVaisseau(vr);
        deathStar.attireVaisseau(va2);
    }
}
