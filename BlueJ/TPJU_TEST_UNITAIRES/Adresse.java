
/**
 * Write a description of class Adresse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Adresse
{
    private String rue;
    private String ville;
    private String codePostal;


    /**
     * Constructor for objects of class Adresse
     */
    public Adresse()
    {
        // initialise instance variables
    }

        // Getters and Setters
    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }
    
        // Method that returns the full address
    public String getFullAddress() {
        return rue + ", " + ville + " " + codePostal;
    }


}
