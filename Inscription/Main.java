import java.util.Scanner;
Public class Main {
             Public static void main( String args[]{
public static


   do {
                  System.out.println("1- Ajouter Classe");
                  System.out.println("2-Lister Classe")
                  System.out.println("3-Inscrire Etudiant")
                  System.out.println("4-Lister Etudiant")
                  System.out.println("5-Affecter Professeur")
                  System.out.println("6-Lister Professeur")
                  System.out.println("7-Quitter")
                  System.out.println("Entrer libelle classe");
                    choix=clavier.nextLine;
                  
                  swich(choix){

                    case "1":
         
                    System.out.println("Entrer libelle classe");
                    String libelle=clavier.nextLine();
                    Classe cl=new Classe();
                    cl.setLibelle(libelle);

                    service.ajouterClasse(cl);
                    
                    break;
                    case "2":
                    System.out.println("-------------########-------------");
                    service.listerClasse();
                    System.out.println("-------------########-------------");
                    break;


                    case "3":
         
                    System.out.println("Entrer nom de l'etudiant");
                    String nom=clavier.nextLine();
                    Classe nom=new nom();
                    cl.setNom(nom);

                    System.out.println("Entrer prenom de l'etudiant");
                    String prenom=clavier.nextLine();
                    Classe prenom=new prenom();
                    cl.setPrenom(prenom);

                    System.out.println("Entrer le tuteur de l'etudiant");
                    String Tuteur=clavier.nextLine();
                    Classe tuteur=new tuteur();
                    cl.setTuteur(tuteur);

                    service.inscrireEtudiant(cl);
                    
                    break;
                    
                    case "4":
                    System.out.println("-------------########-------------");
                    service.listerPersonne();
                    System.out.println("-------------########-------------");
                    break;

                      }

             }while (choix!="7")

}