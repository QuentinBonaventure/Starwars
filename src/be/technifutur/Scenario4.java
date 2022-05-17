package be.technifutur;

public class Scenario4 {


    public static void main(String[] args) {
    Personnage [] montab = new Personnage[]{
            new Jedi("ObiWan"),
            new Sith("Dark Vador"),
            new Clone(),
            new Soldat("BigRebel"),
    };

       Force f;

       for(Personnage p : montab){
           System.out.println();
           System.out.println(p.getNom());
           p.afficheCamp();
           if(p instanceof Force){
               f = (Force) p;
               f.utiliseForce();
           }
           p.combattre();
       }

    }
}
