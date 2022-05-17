package be.technifutur;

public class Scenario3 {
    public static void main(String[] args) {
        VaisseauAncetre va = new VaisseauAncetre("Wing");
        VaisseauEmpire ve = new VaisseauEmpire("XWing");
        VaisseauRebel vr = new VaisseauRebel("Millenium");

        ve.decoller();
        System.out.println(VaisseauAncetre.getNbEnVol());
        ve.atterir();
        System.out.println(VaisseauAncetre.getNbEnVol());
        ve.tirerMissile();
        VaisseauAncetre va2 = ve; // peut recevoir le truc de l'enfant mais pas l'inverse

    }
}
