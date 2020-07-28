Public abstract class Personne implements IInscription{
   
     //Générer id

     protected int id;
     protected String nom;
     protected String prenom;

     //Constructeur par défaut => créer un objet de type personne
     public Personne(){

     }

     //Surcharge 
     //=> créer un objet de type personne
     //En plus il peut initialiser
     public Personne(String nom, String prenom){
       this.nom = nom;
       this.prenom = prenom;
     }


     public int getId(){
       return id;
     }
     public String getNom(){
       return nom;
     }
     public String getPrenom(){
       return prenom;
     }
     public void setId (int id){
        this.id = id;
     }
     public void setNom (String nom){
        this.nom = nom;
     }
     public void setPrenom (String prenom){
        this.prenom = prenom;
     }
     @Override
     public String affiche(){
       return "Id: "+this.id+"Nom: "+this.nom+" Prenom: "this.prenom ;
     }



}