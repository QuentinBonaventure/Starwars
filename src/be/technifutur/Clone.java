package be.technifutur;

public class Clone extends Empire {
    public Clone() {
        super("Clone");
    }

    @Override
    public void combattre() {
        System.out.println("J'aide Dark Vador à combattre les jedis");
    }
}
