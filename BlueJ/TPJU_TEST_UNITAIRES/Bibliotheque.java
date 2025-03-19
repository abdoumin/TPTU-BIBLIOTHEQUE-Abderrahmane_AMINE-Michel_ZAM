
/**
 * Write a description of class Bibliotheque here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bibliotheque
{
    // instance variables - replace the example below with your own
    private String nom;
    private int nombreDeLivres;
    private Adresse adresse;

    /**
     * Constructor for objects of class Bibliotheque
     */
    public Bibliotheque()
    {
        // initialise instance variables
    }
        // Getter for nom
    public String getNom() {
        return nom;
    }

    // Setter for nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter for nombreDeLivres
    public int getNombreDeLivres() {
        return nombreDeLivres;
    }

    // Setter for nombreDeLivres
    public void setNombreDeLivres(int nombreDeLivres) {
        this.nombreDeLivres = nombreDeLivres;
    }
    
    public String afficherDetails(){
        return "Le nom : " + this.nom + " Le nombre de pages : " + this.nombreDeLivres; 
    }
    
    public Adresse getAdresse()
    {
        return this.adresse;
    }
    public void setAdresse(Adresse adresse){
        this.adresse = adresse;
    }
    
        // Method that collaborates with Adresse
    public String getDescription() {
        String description = "Bibliothèque: " + nom + " (" + nombreDeLivres + " livres)";
        if (adresse != null) {
            description += ", Localisation: " + adresse.getFullAddress(); 
        } else {
            description += ", Pas d'adresse renseignée.";
        }
        return description;
    }


    
}
