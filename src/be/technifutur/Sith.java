package be.technifutur;

public class Sith extends Empire implements Force{
    public Sith(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("J'utilise mon sabre laser mais de maniere négative");
    }

    @Override
    public void utiliseForce() {
        System.out.println("J'utilise le coté obscur de la force");
    }
}
