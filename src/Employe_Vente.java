public class Employe_Vente extends Employe_commercial {

    private final int remun_fixe = 400;

    public Employe_Vente(String nom, String prenom, int age, String date_entree, int chiffre_affaire) {
        super(nom, prenom, age, date_entree, chiffre_affaire);
    }


    @Override
    public double calculerSalaire() {
        return (getMultiplicateur_fixe()*getChiffre_affaire())+getRemun_fixe();
    }

    public int getRemun_fixe() {
        return remun_fixe;
    }

}
