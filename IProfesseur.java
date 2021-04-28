
package miniProjetInterface;

import java.util.List;
import miniprojet.Professeur;

/**
 *
 * @author THIERNO A. BALDE
 */
public interface IProfesseur {
    public void addProfesseur(Professeur professeur);
    
    public void updateProfesseur(Professeur professeur);
    
    public void deleteProfesseur(Professeur professeur);
    
    public Professeur getProfesseurByid(int id);
    
    public List<Professeur> getAllProfesseur();
      
}
