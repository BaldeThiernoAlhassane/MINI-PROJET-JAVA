
package miniprojet;

/**
 *
 * @author THIERNO A. BALDE
 */
public class Etudiant extends Personne {
    private String groupeSanguin;
    
    public Etudiant(){
        super();
    }
    
    public Etudiant(int id,
                        String matricule,
                        String prenom,
                        String nom,
                        String dateNaissance,
                        String lieuNaissance,
                        String adresse,
                        String telephone,
                        String email,
                        String nationalite,
                        String genre,
                        String situationMatrimoniale,
                        String groupeSanguin){
        super(id,
    matricule,
    prenom,
    nom,
    dateNaissance,
    lieuNaissance,
    adresse,
    telephone,
    email,
    nationalite,
    genre,
    situationMatrimoniale);
        this.groupeSanguin = groupeSanguin;
}

   
    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }
    
    public String afficherPrenom(){
        return super.getPrenom();
    }

    @Override
    public String toString() {
        return super.toString()+ "groupeSanguin=" + groupeSanguin + '}';
    }
    
}

