
package miniProjetInterface;

import java.util.List;
import miniprojet.Etudiant;

/**
 *
 * @author THIERNO A. BALDE
 */
public interface IEtudiant {
    
    public void addEtudiant(Etudiant etudiant);
    
    public void updateEtudiant(Etudiant etudiant);
    
    public void deleteEtudiant(Etudiant etudiant);
    
    public Etudiant getEtudiantByid(int id);
    
    public List<Etudiant> getAllEtudiant();
   
}
