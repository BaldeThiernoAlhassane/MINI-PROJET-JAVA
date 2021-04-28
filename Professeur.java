
package miniprojet;

/**
 *
 * @author THIERNO A. BALDE
 */
public class Professeur extends Personne {
    
    private String specialite;
    
    public Professeur(){
        super();
    }
    
    public Professeur(int id,
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
                        String specialite){
                
                super( id,matricule,
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
                this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }       

    @Override
    public String toString() {
        return super.toString() + "specialite=" + specialite + '}';
    }
}
