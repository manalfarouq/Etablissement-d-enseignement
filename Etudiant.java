class Etudiant extends Personne {
    private String diplome;
    private static int nbEtudiants;

    public Etudiant(String nom, String prenom, String adresse, String diplome) {
        super(nom, prenom, adresse);
        this.diplome = diplome;
        nbEtudiants++;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public static int getNbEtudiants() {
        return nbEtudiants;
    }

    public String toString() {
        return super.toString() + "| Diplome : " + diplome;
    }
}