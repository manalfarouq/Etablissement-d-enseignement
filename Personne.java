import java.util.ArrayList;

abstract class Personne {
    protected String Name;
    protected String Prenom;
    protected String Adresse;
    private static int nbPersonne = 0;
    private static ArrayList<Personne> listePersonnes = new ArrayList<>();

    public Personne(String name,String prenom,String adresse) {
        this.Name = name;
        this.Prenom = prenom;
        this.Adresse = adresse;
        nbPersonne++;
        listePersonnes.add(this);
    }

    public static int getNbPersonnes() {
        return nbPersonne;
    }
    public static ArrayList<Personne> getListePersonnes() {
        return listePersonnes;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }

    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }

    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String adresse) {
        this.Adresse = adresse;
    }

    public String toString() {
        return "Name: " + Name + "| Prenom: " + Prenom + "| Adresse: " + Adresse ;
    }
}