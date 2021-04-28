
package miniprojet;

import java.util.List;
import java.util.Scanner;
import miniProjetImp.EtudiantImp;
import miniProjetImp.GroupeEtudiantImp;
import miniProjetImp.GroupeImp;
import miniProjetImp.ProfesseurImp;

/**
 *
 * @author THIERNO A. BALDE
 */
public class TestMenu {
    public static void main(String args[]){
                        GroupeImp groupeImp = new GroupeImp();
                        EtudiantImp etudiantImp = new EtudiantImp();
                        ProfesseurImp professeurImp = new ProfesseurImp();
                        GroupeImp gi = new GroupeImp();
                        GroupeEtudiantImp groupeEtudiantImp;

        
        boolean var = true;
        
        while(var){
       
        
        System.out.println("*********Menu Principal**********");
        
        
        System.out.println("1-Gestion Groupe");
        System.out.println("2-Gestion Etudiant");
        System.out.println("3-Gestion Professeur");
        System.out.println("4-Gestion_Etudiant");
        System.out.println("5-Quitter");

        System.out.println("");
        System.out.println("Entrez votre choix: ");
        
        Scanner scanner= new Scanner(System.in);

        int choix = scanner.nextInt();
        
        switch(choix){
            case 1:
                
                boolean var1 = true;
        
                while(var1){
                System.out.println("*****************Gestion Groupe*******************");
                System.out.println("1-Creer un Groupe");
                System.out.println("2-Modifier un Groupe");
                System.out.println("3-Voir les details d'un Groupe");
                System.out.println("4-Supprimer un Groupe");
                System.out.println("5-Afficher tous les Groupes");
                System.out.println("6-Quitter");
                
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                
                int choixGroupe = scanner.nextInt();
        
        switch(choixGroupe){
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("1-Creer un Groupe");
                
                System.out.println("Id:");
                int id = scanner.nextInt();
                
                System.out.println("Nom du Groupe:");
                String nomGroupe = scanner.next();
                
                System.out.println("Date de Creation:");
                String dateCreation = scanner.next();
                
                Groupe groupe = new Groupe(id,nomGroupe,dateCreation);
                
                groupeImp.addGroupe(groupe);
                System.out.println("Groupe creer avec succès");

                break; 
                
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("2-Modifier un Groupe");
                
                System.out.println("Id: ");
                int idMod = scanner.nextInt();
                                
                Groupe groupe2 = groupeImp.getGroupeByid(idMod);
                
                groupeImp.updateGroupe(groupe2);
                
                System.out.println("Nom du Groupe:");
                String nomGroupeG = scanner.next();
                groupe2.setNomGroupe(nomGroupeG);
                
                System.out.println("Date de Creation:");
                String dateCreationG= scanner.next();
                groupe2.setDateCreation(dateCreationG);
                
                System.out.println("Groupe modifié avec succès");
                
                break;
                
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("3-Voir les details d'un Groupe");
                
                System.out.println("Id: ");
                int idG = scanner.nextInt();
                
                Groupe groupe3 = groupeImp.getGroupeByid(idG);
                
                System.out.println(groupe3.getNomGroupe());
                System.out.println(groupe3.getDateCreation());
                
                System.out.println("Details du Groupe");


                break;
                
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("4-Supprimer un Groupe");
                
                System.out.println("Id: ");
                int Id = scanner.nextInt();
                
                Groupe groupe4 = groupeImp.getGroupeByid(Id);
                
                groupeImp.deleteGroupe(groupe4);
                
                System.out.println(groupe4.getNomGroupe());
                System.out.println(groupe4.getDateCreation());
               
                System.out.println("Groupe Supprimé avec succès");
                
                
                break;

                
            case 5:
                System.out.println("-----------------------------------");
                System.out.println("5-Afficher tous les Groupes");
                
                List<Groupe> groupes = groupeImp.getAllGroupe();

                for(Groupe groupe5:groupes){
                    System.out.println(groupe5.getId());
                    System.out.println(groupe5.getNomGroupe());
                    System.out.println(groupe5.getDateCreation());
                    
                    
                    System.out.println("--------------------------------------");

                }
                
                break;
                
            case 6:
                System.out.println("-----------------------------------");
                System.out.println("6-Quitter ");
                
                var1 = false;
                var = true;
                break;
           
            default:
                System.out.println("-----------------------------------");
                System.out.println("Choix invalid");
        }}      break;
        
     
        
            case 2:
                
                boolean var2 = true;
        
                while(var2){
                System.out.println("*****************Gestion Etudiant*******************");
                System.out.println("1-Ajouter un Etudiant");
                System.out.println("2-Modifier un Etudiant");
                System.out.println("3-Voir les details d'un Etudiant");
                System.out.println("4-Supprimer un Etudiant");
                System.out.println("5-Afficher tous les Etudiants");
                System.out.println("6-Quitter");
                
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                
                int choixEtudiant = scanner.nextInt();
        
        switch(choixEtudiant){
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("1-Ajouter un Etudiant");
                
                System.out.println("Id:");
                int id = scanner.nextInt();
                
                System.out.println("Matricule:");
                String matricule = scanner.next();
                           
                System.out.println("Nom:");
                String nom = scanner.next();
                
                System.out.println("Prenom:");
                String prenom = scanner.next();
                
                System.out.println("Date de Naissance:");
                String dateNaissance = scanner.next();
                
                System.out.println("Lieu de Naissance:");
                String lieuNaissance = scanner.next();
                
                System.out.println("Email:");
                String email = scanner.next();
                
                System.out.println("Nationalite:");
                String nationalite = scanner.next();
                
                System.out.println("Genre:");
                String genre = scanner.next();
            
                System.out.println("Adresse:");
                String adresse = scanner.next();
                
                System.out.println("Telephone:");
                String telephone = scanner.next();
                
                System.out.println("Situation Matrimoniale:");
                String situationMatrimoniale = scanner.next();
                
                System.out.println("Groupe Sanguin:");
                String groupSanguin = scanner.next();
                

                Etudiant etudiant = new Etudiant(id, matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,telephone,email,nationalite,genre,situationMatrimoniale,groupSanguin);
                
                
                etudiantImp.addEtudiant(etudiant);
                
                System.out.println("Ajout Etudiant effectuer avec succès");
                break; 
                
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("2-Modifier un Etudiant");
                
                System.out.println("Id: ");
                int idMod = scanner.nextInt();
                                
                Etudiant etudiant2 = etudiantImp.getEtudiantByid(idMod);
                
                etudiantImp.updateEtudiant(etudiant2);
                
                System.out.println("Matricule:");
                String matriculeE = scanner.next();
                etudiant2.setMatricule(matriculeE);
                
                System.out.println("Nom:");
                String nomE = scanner.next();
                etudiant2.setNom(nomE);
                
                System.out.println("Prenom:");
                String prenomE = scanner.next();
                etudiant2.setPrenom(prenomE);
               
                System.out.println("Date de Naissance:");
                String dateNaissanceE = scanner.next();                                
                etudiant2.setDateNaissance(dateNaissanceE);

                System.out.println("Lieu de Naissance:");
                String lieuNaissanceE = scanner.next();
                etudiant2.setLieuNaissance(lieuNaissanceE);
                
                System.out.println("Email:");
                String emailE = scanner.next();
                etudiant2.setEmail(emailE);
                
                System.out.println("Nationalite:");
                String nationaliteE = scanner.next();
                etudiant2.setNationalite(nationaliteE);
                
                System.out.println("Genre:");
                String genreE = scanner.next();
                etudiant2.setGenre(genreE);
            
                System.out.println("Adresse:");
                String adresseE = scanner.next();
                etudiant2.setAdresse(adresseE);
                
                System.out.println("Telephone:");
                String telephoneE = scanner.next();
                etudiant2.setTelephone(telephoneE);
                
                System.out.println("Situation Matrimoniale:");
                String situationMatrimonialeE = scanner.next();
                etudiant2.setSituationMatrimoniale(situationMatrimonialeE);
                
                System.out.println("Groupe Sanguin:");
                String groupeSanguinE = scanner.next();
                etudiant2.setGroupeSanguin(groupeSanguinE);
                
                System.out.println("Etudiant modifié avec succès");
                
                
                break;
                
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("3-Voir les details d'un Etudiant");
                
                System.out.println("Id: ");
                int idE = scanner.nextInt();
                
                Etudiant etudiant3 = etudiantImp.getEtudiantByid(idE);
                
                System.out.println(etudiant3.getMatricule());
                System.out.println(etudiant3.getNom());
                System.out.println(etudiant3.getPrenom());
                System.out.println(etudiant3.getDateNaissance());
                System.out.println(etudiant3.getLieuNaissance());
                System.out.println(etudiant3.getEmail());
                System.out.println(etudiant3.getNationalite());
                System.out.println(etudiant3.getGenre());
                System.out.println(etudiant3.getAdresse());
                System.out.println(etudiant3.getTelephone());
                System.out.println(etudiant3.getSituationMatrimoniale());
                System.out.println(etudiant3.getGroupeSanguin());
                
                System.out.println("Details de l'Etudiant");

                break;
                
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("4-Supprimer un Etudiant");
                
                System.out.println("Id: ");
                int Id = scanner.nextInt();
                
                Etudiant etudiant4 = etudiantImp.getEtudiantByid(Id);
                
                etudiantImp.deleteEtudiant(etudiant4);
                
                System.out.println(etudiant4.getMatricule());
                System.out.println(etudiant4.getNom());
                System.out.println(etudiant4.getPrenom());
                System.out.println(etudiant4.getDateNaissance());
                System.out.println(etudiant4.getLieuNaissance());
                System.out.println(etudiant4.getEmail());
                System.out.println(etudiant4.getNationalite());
                System.out.println(etudiant4.getGenre());
                System.out.println(etudiant4.getAdresse());
                System.out.println(etudiant4.getTelephone());
                System.out.println(etudiant4.getSituationMatrimoniale());
                System.out.println(etudiant4.getGroupeSanguin());

                System.out.println("Etudiant Supprimé avec succès");
                break;
                
            case 5:
                System.out.println("-----------------------------------");
                System.out.println("5-Afficher tous les Etudiants");
                
                List<Etudiant> etudiants = etudiantImp.getAllEtudiant();

                for(Etudiant etudiant5:etudiants){
                    System.out.println(etudiant5.getId());
                    System.out.println(etudiant5.getMatricule());
                    System.out.println(etudiant5.getPrenom());
                    System.out.println(etudiant5.getNom());
                    System.out.println(etudiant5.getDateNaissance());
                    System.out.println(etudiant5.getLieuNaissance());
                    System.out.println(etudiant5.getAdresse());
                    System.out.println(etudiant5.getTelephone());
                    System.out.println(etudiant5.getEmail());
                    System.out.println(etudiant5.getNationalite());
                    System.out.println(etudiant5.getGenre());
                    System.out.println(etudiant5.getSituationMatrimoniale());
                    System.out.println(etudiant5.getGroupeSanguin());   
                    
                    System.out.println("--------------------------------------");

                }
                break;      
            case 6:
                System.out.println("-----------------------------------");
                System.out.println("6-Quitter");
                
                var2 = false;
                var = true;
                break;
                
            default:
                System.out.println("-----------------------------------");
                System.out.println("Choix invalid");
        }}      break;
        
        
            case 3:
                
                boolean var3 = true;
        
                while(var3){
                System.out.println("*****************Gestion Professeur*******************");
                System.out.println("1-Ajouter un Professeur");
                System.out.println("2-Modifier un Professeur");
                System.out.println("3-Voir les details d'un Professeur");
                System.out.println("4-Supprimer un Professeur");
                System.out.println("5-Afficher tous les Professeurs");
                System.out.println("6-Quitter");
                
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                
                int choixProfesseur = scanner.nextInt();
        
        switch(choixProfesseur){
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("1-Ajouter un Professeur");
                
                 System.out.println("id :");
                int id = scanner.nextInt();
                
                System.out.println("Matricule :");
                String matricule = scanner.next();
                           
                System.out.println("Nom :");
                String nom = scanner.next();
                
                System.out.println("Prenom :");
                String prenom = scanner.next();
                
                System.out.println("Date de Naissance :");
                String dateNaissance = scanner.next();
                
                System.out.println("Lieu de Naissance :");
                String lieuNaissance = scanner.next();
                
                System.out.println("Email :");
                String email = scanner.next();
                
                System.out.println("Nationalite :");
                String nationalite = scanner.next();
                
                System.out.println("Genre :");
                String genre = scanner.next();
            
                System.out.println("Adresse :");
                String adresse = scanner.next();
                
                System.out.println("Telephone :");
                String telephone = scanner.next();
                
                System.out.println("Situation Matrimoniale :");
                String situationMatrimoniale = scanner.next();
                
                System.out.println("Specialite :");
                String specialite = scanner.next();
                

                Professeur professeur = new Professeur(id, matricule,prenom,nom,dateNaissance,lieuNaissance,adresse,telephone,email,nationalite,genre,situationMatrimoniale,specialite);
                
                
                professeurImp.addProfesseur(professeur);
                
                System.out.println("Ajout Professeur effectuer avec succès");
                break; 
                
                
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("2-Modifier un Professeur");
                
                System.out.println("Id: ");
                int idMod1 = scanner.nextInt();
                                
                Professeur professeur2 = professeurImp.getProfesseurByid(idMod1);
                
                professeurImp.updateProfesseur(professeur2);
                
                System.out.println("Matricule:");
                String matriculeP = scanner.next();
                professeur2.setMatricule(matriculeP);
                
                System.out.println("Nom:");
                String nomP = scanner.next();
                professeur2.setNom(nomP);
                
                System.out.println("Prenom:");
                String prenomP = scanner.next();
                professeur2.setPrenom(prenomP);
               
                System.out.println("Date de Naissance:");
                String dateNaissanceP = scanner.next();                                
                professeur2.setDateNaissance(dateNaissanceP);

                System.out.println("Lieu de Naissance:");
                String lieuNaissanceP = scanner.next();
                professeur2.setLieuNaissance(lieuNaissanceP);
                
                System.out.println("Email:");
                String emailP = scanner.next();
                professeur2.setEmail(emailP);
                
                System.out.println("Nationalite:");
                String nationaliteP = scanner.next();
                professeur2.setNationalite(nationaliteP);
                
                System.out.println("Genre:");
                String genreP = scanner.next();
                professeur2.setGenre(genreP);
            
                System.out.println("Adresse:");
                String adresseP = scanner.next();
                professeur2.setAdresse(adresseP);
                
                System.out.println("Telephone:");
                String telephoneP = scanner.next();
                professeur2.setTelephone(telephoneP);
                
                System.out.println("Situation Matrimoniale:");
                String situationMatrimonialeP = scanner.next();
                professeur2.setSituationMatrimoniale(situationMatrimonialeP);
                
                System.out.println("Specialite:");
                String specialiteP = scanner.next();
                professeur2.setSpecialite(specialiteP);
                
                System.out.println("Professeur modifié avec succès");
                
                break;
                
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("3-Voir les details d'un Professeur");
                
                System.out.println("Id: ");
                int idP = scanner.nextInt();
                
                Professeur professeur3 = professeurImp.getProfesseurByid(idP);
                
                System.out.println(professeur3.getMatricule());
                System.out.println(professeur3.getNom());
                System.out.println(professeur3.getPrenom());
                System.out.println(professeur3.getDateNaissance());
                System.out.println(professeur3.getLieuNaissance());
                System.out.println(professeur3.getEmail());
                System.out.println(professeur3.getNationalite());
                System.out.println(professeur3.getGenre());
                System.out.println(professeur3.getAdresse());
                System.out.println(professeur3.getTelephone());
                System.out.println(professeur3.getSituationMatrimoniale());
                System.out.println(professeur3.getSpecialite());
                
                System.out.println("Details du Professeur");
                
                break;
                
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("4-Supprimer un Professeur");
                
                System.out.println("Id: ");
                int Id = scanner.nextInt();
                
                Professeur professeur4 = professeurImp.getProfesseurByid(Id);
                
                professeurImp.deleteProfesseur(professeur4);
                
                
                System.out.println(professeur4.getMatricule());
                System.out.println(professeur4.getNom());
                System.out.println(professeur4.getPrenom());
                System.out.println(professeur4.getDateNaissance());
                System.out.println(professeur4.getLieuNaissance());
                System.out.println(professeur4.getEmail());
                System.out.println(professeur4.getNationalite());
                System.out.println(professeur4.getGenre());
                System.out.println(professeur4.getAdresse());
                System.out.println(professeur4.getTelephone());
                System.out.println(professeur4.getSituationMatrimoniale());
                System.out.println(professeur4.getSpecialite());
                
                System.out.println("Professeur Supprimé avec succès");
                
                break;
                
            case 5:
                System.out.println("-----------------------------------");
                System.out.println("5-Afficher tous les Professeurs");
                
                List<Professeur> professeurs = professeurImp.getAllProfesseur();

                for(Professeur professeur5:professeurs){
                    System.out.println(professeur5.getId());
                    System.out.println(professeur5.getMatricule());
                    System.out.println(professeur5.getPrenom());
                    System.out.println(professeur5.getNom());
                    System.out.println(professeur5.getDateNaissance());
                    System.out.println(professeur5.getLieuNaissance());
                    System.out.println(professeur5.getAdresse());
                    System.out.println(professeur5.getTelephone());
                    System.out.println(professeur5.getEmail());
                    System.out.println(professeur5.getNationalite());
                    System.out.println(professeur5.getGenre());
                    System.out.println(professeur5.getSituationMatrimoniale());
                    System.out.println(professeur5.getSpecialite());   
                    
                    System.out.println("--------------------------------------");

                }
                
                break;
                
            case 6:
                System.out.println("-----------------------------------");
                System.out.println("6-Quitter");
                
                var3 = false;
                var = true;
                break;
                
            default:
                System.out.println("-----------------------------------");
                System.out.println("Choix invalid");
        }}      break;
        
            case 4:
                
                boolean var4 = true;
        
                while(var4){
                System.out.println("*****************Gestion Groupe_Etudiant*******************");
                
                System.out.println("1-Ajouter un Etudiant dans un Groupe");
                System.out.println("2-Supprimer un Etudiant dans un Groupe");
                System.out.println("5-Afficher tous etudiants dans un Groupe");
                System.out.println("6-Quitter");
                
                System.out.println("");
                System.out.println("Entrez votre choix: ");
                
                int choixGE = scanner.nextInt();
        
        switch(choixGE){
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("1-Ajouter un Etudiant dans un Groupe");
                
                System.out.println("Id:");
                int id = scanner.nextInt();
            
                
                Groupe gp = gi.getGroupeByid(id);
                groupeEtudiantImp = new GroupeEtudiantImp(gp,etudiantImp.getAllEtudiant());
                System.out.println("Etudiant ajoute dans un Groupe avec succes");

                break;
            case 2:
                System.out.println("");
                break; 
            case 3:
                System.out.println("2-Afficher tous etudiants dans un Groupe");
                //groupeEtudiantImp.showEtudiantGroupe();
                break; 
            case 4:
                System.out.println("3-Afficher tous etudiants dans un Groupe");
                //groupeEtudiantImp.showEtudiantGroupe();
                break;
            case 5:
                System.out.println("4-Quitter");
                //groupeEtudiantImp.showEtudiantGroupe();
                
                var4 = false;
                var4 = true;
                break;
            default:
                System.out.println("5-Choix Invalid");
                //groupeEtudiantImp.showEtudiantGroupe();
        }}
                break;
            
            case 5:
                System.out.println("*****************Merci et à très bientôt!!!******************");
                System.exit(0);
                break;
                
            default:
                System.out.println("Choix invalid"); 
                break;
        
        } 
    } }
}
