public class Employe_Manutention_danger extends Employe_Manutention implements Employe_Risque{

    public Employe_Manutention_danger(String nom, String prenom, int age, String date_entree, int nbre_heure) {
        super(nom, prenom, age, date_entree, nbre_heure);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire()+prime_risque;
    }
}
