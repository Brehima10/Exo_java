Public classe Etudiant extends Personne{

    //proprietes Etudiants
      private String tuteur

    //proprietes Navigationnelles
    // =>Association many to one entre Etudiant et Classe

      private Classe classeEtu;

    //constructeurs
      //Par défaut
      //Super => classe parente
      //Super => personne
    public Etudiant (){
      super(); //Personne();
     }
     //Surcharge
    public Etudiant (String nom,String prenom,String tuteur,Classe classeEtu){
      super(); //Personne();
     }
    //Getters et Setters
     public String getTuteur(){
       return tuteur;
     }
     public Classe getClasseEtu(){
       return classeEtu;
     }
     public void setTuteur (String tuteur){
        this.tuteur = tuteur;
     }
     public void setClasseEtu (Classe classeEtu){
        this.classeEtu = classeEtu;
     }



}