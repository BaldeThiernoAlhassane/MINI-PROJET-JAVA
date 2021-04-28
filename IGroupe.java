
package miniProjetInterface;

import java.util.List;
import miniprojet.Groupe;

/**
 *
 * @author THIERNO A. BALDE
 */
public interface IGroupe {
    
    public void addGroupe(Groupe groupe);
    
    public void updateGroupe(Groupe groupe);
    
    public void deleteGroupe(Groupe groupe);
    
    public Groupe getGroupeByid(int id);
    
    public List<Groupe> getAllGroupe();
    
}
