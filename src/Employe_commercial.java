import java.util.Date;

public abstract class Employe_commercial extends Employe{

    private final double multiplicateur_fixe = 0.20;
    private int chiffre_affaire;

    public Employe_commercial(String nom, String prenom, int age, String date_entree, int chiffre_affaire) {
        super(nom, prenom, age, date_entree);
        this.chiffre_affaire = chiffre_affaire;
    }

    public int getChiffre_affaire() {
        return chiffre_affaire;
    }

    public void setChiffre_affaire(int chiffre_affaire) {
        this.chiffre_affaire = chiffre_affaire;
    }

    public double getMultiplicateur_fixe() {
        return multiplicateur_fixe;
    }
}
