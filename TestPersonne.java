import java.util.ArrayList;
import java.util.Scanner;

public class TestPersonne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuer = true;
        while (continuer) {
            System.out.print("\nEntrez votre nom : ");
            String nom = sc.next();
            System.out.print("\nEntrez votre prénom : ");
            String prenom = sc.next();
            sc.nextLine(); // Consomme la fin de ligne restante
            System.out.print("\nEntrez votre adresse : ");
            String adresse = sc.nextLine(); // Utiliser nextLine() pour prendre toute la ligne

            String choix = "";
            boolean categorieValide = false;
            while (!categorieValide) {
                System.out.print("\nEntrez votre catégorie (Enseignant/Secretaire/Etudiant) : ");
                choix = sc.next().toUpperCase();
                if (choix.equals("ENSEIGNANT") || choix.equals("EN") || choix.equals("SECRETAIRE") || choix.equals("S") || choix.equals("ETUDIANT") || choix.equals("ET")) {
                    categorieValide = true;
                } else {
                    System.out.println("Catégorie invalide. Veuillez saisir une catégorie valide.");
                }
            }

            if (choix.equals("ENSEIGNANT") || choix.equals("EN")) {
                System.out.print("\nEntrez votre spécialité : ");
                String specialite = sc.next();
                Enseignant enseignant = new Enseignant(nom, prenom, adresse, specialite);
            } else if (choix.equals("SECRETAIRE") || choix.equals("S")) {
                System.out.print("\nEntrez votre numéro de bureau : ");
                int numeroBureau = sc.nextInt();
                Secretaire secretaire = new Secretaire(nom, prenom, adresse, numeroBureau);
            } else if (choix.equals("ETUDIANT") || choix.equals("ET")) {
                System.out.print("\nEntrez votre Diplôme : ");
                String diplome = sc.next();
                Etudiant etudiant = new Etudiant(nom, prenom, adresse, diplome);
            }

            // Vérifiez si l'utilisateur souhaite ajouter une autre personne
            System.out.print("\nVoulez-vous ajouter une autre personne ? (oui/non) : ");
            String reponse = sc.next().toLowerCase();
            if (!reponse.equals("oui")) {
                continuer = false;
                System.out.println("\n*******************************");
                System.out.println("Nombre total de personnes : " + Personne.getNbPersonnes());
                System.out.println("Nombre de secrétaires : " + Secretaire.getNbSecretaires());
                System.out.println("Nombre d'enseignants : " + Enseignant.getNbEnseignants());
                System.out.println("Nombre d'étudiants : " + Etudiant.getNbEtudiants());

                ArrayList<Personne> listePersonnes = Personne.getListePersonnes();
                System.out.println("\nListe des personnes : ");
                for (Personne personne : listePersonnes) {
                    System.out.println(personne);
                }
                System.out.println("\nAu revoir!");
            }
        }

        // Fermer Scanner
        sc.close();
    }
}
