
package miniprojet;

import java.util.Objects;

/**
 *
 * @author THIERNO A. BALDE
 */
public class Personne {
            private int id;
            private String matricule;
            private String prenom;
            private String nom;
            private String dateNaissance;
            private String lieuNaissance;
            private String adresse;
            private String telephone;
            private String email;
            private String nationalite;
            private String genre;
            private String situationMatrimoniale;

    
    public Personne(){
    
    }

    public Personne(int id, String matricule, String prenom, String nom, String dateNaissance, String lieuNaissance, String adresse, String telephone, String email, String nationalite, String genre, String situationMatrimoniale) {
            this.id = id;
            this.matricule = matricule;
            this.prenom = prenom;
            this.nom = nom;
            this.dateNaissance = dateNaissance;
            this.lieuNaissance = lieuNaissance;
            this.adresse = adresse;
            this.telephone = telephone;
            this.email = email;
            this.nationalite = nationalite;
            this.genre = genre;
            this.situationMatrimoniale = situationMatrimoniale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSituationMatrimoniale() {
        return situationMatrimoniale;
    }

    public void setSituationMatrimoniale(String situationMatrimoniale) {
        this.situationMatrimoniale = situationMatrimoniale;
    }

    @Override
    public String toString() {
        return "id=" + id + ", matricule=" + matricule + ", prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", lieuNaissance=" + lieuNaissance + ", adresse=" + adresse + ", telephone=" + telephone + ", email=" + email + ", nationalite=" + nationalite + ", genre=" + genre + ", situationMatrimoniale=" + situationMatrimoniale;
    }    
}
