public class service{

  //Taille Réservation
   private final int TAILLE=10;
 //Taille Reelle ou position d'inscription dans le tableau
  private int nbreDeClasse=0;
  private final Classe[] tabClasses;
  private int nbreDePersonne=0;
  private final Personne tabDePersonnes[];

  public Service(){
      tabClasses=new Classe[TAILLE];
      tabDePersonnes=new Personne[TAILLE];

     }
  public void ajouter (Classe classe){
      tabClasses[nbreDeClasse]=classe;
      nbreDeClasse++;
     }
  public void listerClasse(){
      for (int i=0; i<nbreDeClasse;i++){
        SystetabClasses[i].affiche()

      }
   public void inscrire (Personne personne){
      tabPeronnes[nbreDePersonne]=personne;
      nbreDePersonne++;
     }
   public void listerPersonne(){
      for (int i=0; i<nbreDePersonne;i++){
        SystetabPersonnes[i].affiche()

      }
     }
 }