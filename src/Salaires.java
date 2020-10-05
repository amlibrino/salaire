public class Salaires {

    public static void main(String[] args) {

        Personnel p = new Personnel();
        p.ajouterEmploye(new Employe_Vente("Pierre", "Business", 56, "1995",30000));
        p.ajouterEmploye(new Employe_Representation("Léon", "Vendtout", 56, "2001",20000));
        p.ajouterEmploye(new Employe_Production("Yves", "Bosseur", 56, "1995",1000));
        p.ajouterEmploye(new Employe_Production_danger("Pierre", "Business", 56, "1995",45));
        p.ajouterEmploye(new Employe_Manutention("Pierre", "Business", 56, "1995",1000));
        p.ajouterEmploye(new Employe_Manutention_danger("Pierre", "Business", 56, "1995",45));
        p.afficherSalaire();
        System.out.println(" le salaire moyen dans l'entreprise est de : "+ p.salaireMoyen() + " francs.");
        System.out.println(" le liste des salaries dans le service de manutention est : "+ p.getListEmployeManutention());
    }

}
