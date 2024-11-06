class Secretaire extends Personne {
    private int numeroBureau;
    private static int nbSecretaires = 0;

    public Secretaire(String nom, String prenom, String adresse, int numeroBureau) {
        super(nom, prenom, adresse);
        this.numeroBureau = numeroBureau;
        nbSecretaires++;
    }

    public int getNumeroBureau() {
        return numeroBureau;
    }

    public void setNumeroBureau(int numeroB) {
        this.numeroBureau = numeroB;
    }

    public static int getNbSecretaires() {
        return nbSecretaires;
    }

    public String toString() {
        return super.toString() + "| Numero de bureau : " + numeroBureau;
    }
}