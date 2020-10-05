import java.util.ArrayList;
import java.util.List;

public class Personnel {

    List<Employe> listEmploye = new ArrayList<Employe>();


    public void afficherSalaire() {
        System.out.println("le salaire moyen :" + salaireMoyen());
    }

    public void ajouterEmploye(Employe employe) {
        listEmploye.add(employe);
    }

    public double salaireMoyen() {
        double sommeSalaire = 0;

        for (int i = 0; i < listEmploye.size(); i++) {
            sommeSalaire += listEmploye.get(i).calculerSalaire();
        }
        return sommeSalaire / listEmploye.size();

    }

    public List<Employe_Manutention> getListEmployeManutention() {
        List<Employe_Manutention> manutentionList = new ArrayList<>();
        for (Employe employe : listEmploye) {
            if (employe instanceof Employe_Manutention)
                manutentionList.add((Employe_Manutention) employe);
        }
        return manutentionList;
    }// ajouter un test pour cette classe pour mercredi


}
