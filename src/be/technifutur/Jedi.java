package be.technifutur;

public class Jedi extends Rebelle implements Force{
    public Jedi(String nom) {
        super(nom);
    }

    @Override
    public void combattre() {
        System.out.println("J'utilise mon sabre laser ");
    }

    @Override
    public void utiliseForce() {
        System.out.println("J'utilise le bon coté de la force");
    }
}
