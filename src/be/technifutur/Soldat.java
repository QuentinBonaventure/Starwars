package be.technifutur;

public class Soldat extends Rebelle {

    public Soldat(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("J'aide les jedis dans leur combat contre l'empire");
    }
}
