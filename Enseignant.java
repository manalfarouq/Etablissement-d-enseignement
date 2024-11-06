class Enseignant extends Personne {
    private String specialite;
    private static int nbEnseignant;

    public Enseignant(String nom, String prenom, String adresse, String specialite) {
        super(nom, prenom, adresse);
        this.specialite = specialite;
        nbEnseignant++;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public static int getNbEnseignants() {
        return nbEnseignant;
    }

    public String toString() {
        return super.toString() + "| Specialité : " + specialite;
    }
}