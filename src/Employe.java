public abstract class Employe {
    String nom;
    String prenom;
    int age;
    String date_entree;

    //Constructeur
    public Employe(String nom, String prenom, int age, String date_entree){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date_entree = date_entree;
    }

    //Méthode de calcul de salaire qui dépendra des employés
    public abstract double calculerSalaire();

    //Retourner nom et prénom de l'employé
    public String getNom(){
        return "L'emloyé est : " + nom + " " + prenom;
    }

}
