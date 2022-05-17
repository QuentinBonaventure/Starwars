package be.technifutur;

public class Scenario1 {
    public static void main(String[] args) {

            System.out.println("**** Scenario 1 application StarWars ****");
            System.out.println("Il y a très longtemps, dans une galaxie lointaine...");
            Vaisseau v1 = null;
            Vaisseau v2 = new Vaisseau();
            Vaisseau v3 = new Vaisseau();
            v1 = new Vaisseau();
            System.out.println(v1.nom);
            System.out.println(v1.nbMissiles);
            v1.nom = "Millenium";
            v2.nom = "Xwing";
            v3.nom = "Wing";
            System.out.println(v1.nom);
            System.out.println(v2.nom);
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
            System.out.println("------------");
            v1.nbMissiles = 2;
            v1.tirerMissile();
            v2.tirerMissile();
        }
    }

