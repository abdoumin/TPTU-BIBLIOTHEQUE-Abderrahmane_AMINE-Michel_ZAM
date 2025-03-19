

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestBibliotheque.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestBibliotheque
{
    private Bibliotheque biblio;
    private Adresse adresse;

    /**
     * Default constructor for test class TestBibliotheque
     */
    public TestBibliotheque()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        biblio = new Bibliotheque();
        biblio.setNom("BPU");
        biblio.setNombreDeLivres(1000);
        adresse = new Adresse();
        adresse.setRue("Chatelet des halles");
        adresse.setCodePostal("75015");
        adresse.setVille("Paris");
        biblio.setAdresse(adresse);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testAfficherDetails()
    {
        assertEquals("Le nom : " + this.biblio.getNom() + " Le nombre de pages : " + this.biblio.getNombreDeLivres() , this.biblio.afficherDetails());
    }


    @Test
    public void testGetDescription()
    {
        assertEquals("Bibliothèque: BPU (1000 livres), Localisation: Chatelet des halles, Paris 75015", biblio.getDescription());
    }
}

