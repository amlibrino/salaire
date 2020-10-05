public class Employe_Manutention extends Employe {

    private final int multiplicateur_fixe = 65;
    private int nbre_heure;

    public Employe_Manutention(String nom, String prenom, int age, String date_entree, int nbre_heure) {
        super(nom, prenom, age, date_entree);
        this.nbre_heure = nbre_heure;
    }

    @Override
    public double calculerSalaire() {
        return (getNbre_heure() * getMultiplicateur_fixe());
    }

    public int getNbre_heure() {
        return nbre_heure;
    }

    public void setNbre_heure(int nbre_heure) {
        this.nbre_heure = nbre_heure;
    }

    public int getMultiplicateur_fixe() {
        return multiplicateur_fixe;
    }
}
