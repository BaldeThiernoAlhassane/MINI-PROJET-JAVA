
package miniprojet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIERNO A. BALDE
 */
public class Groupe {
    private int id;
    private String nomGroupe;
    private String dateCreation;
    List<Etudiant> GroupeEtudiant;
    
    public Groupe(){
    
    }

    Groupe(int id, String nomGroupe, String dateCreation) {
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.dateCreation = dateCreation;
        this.GroupeEtudiant = new ArrayList<Etudiant>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
     public Groupe(String nomGroupe){
         this.nomGroupe = nomGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Etudiant> getGroupeEtudiant() {
        return GroupeEtudiant;
    }

    public void setGroupeEtudiant(List<Etudiant> GroupeEtudiant) {
        this.GroupeEtudiant = GroupeEtudiant;
    }
    
    

    @Override
    public String toString() {
        return "Groupe{" + "id=" + id + ", nomGroupe=" + nomGroupe + ", dateCreation=" + dateCreation + '}';
    }

    public List<Etudiant> getEtudiantGroupe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
