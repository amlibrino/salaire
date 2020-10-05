public class Employe_Production extends Employe{

    private final int multiplicateur_fixe = 5;
    private int nbre_unite;

    public Employe_Production(String nom, String prenom, int age, String date_entree, int nbre_unite) {
        super(nom, prenom, age, date_entree);
        this.nbre_unite = nbre_unite;
    }

    @Override
    public double calculerSalaire() {
        return (getMultiplicateur_fixe() * getNbre_unite());
    }

    public int getNbre_unite() {
        return nbre_unite;
    }

    public void setNbre_unite(int nbre_unite) {
        this.nbre_unite = nbre_unite;
    }

    public int getMultiplicateur_fixe() {
        return multiplicateur_fixe;
    }
}
