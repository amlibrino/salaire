public class Employe_Production_danger extends Employe_Production implements Employe_Risque {
    public Employe_Production_danger(String nom, String prenom, int age, String date_entree, int nbre_unite) {
        super(nom, prenom, age, date_entree, nbre_unite);
    }

    public double calculerSalaire() {
        return super.calculerSalaire()+prime_risque;
    }

}
