package be.technifutur;

public class Scenario2 {
    public static void main(String[] args) {
        VaisseauSecurise v1 = new VaisseauSecurise("Millenium");
        VaisseauSecurise v2 = new VaisseauSecurise("XWing");
        v1.tirerMissile();
        v1.addMissiles(5);
        v1.tirerMissile();
        v1.removeMissiles(2);
        v1.decoller();
        System.out.println("nombre d'appareil en vol : " + VaisseauSecurise.getNbEnVol());
        System.out.printf("Il y a %s actuellement en vol %n", VaisseauSecurise.getNbEnVol());
        v2.decoller();
        v1.atterir();
        v1.decoller();
        v1.decoller();
        v1.atterir();
    }
}
