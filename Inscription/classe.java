public Class Classe{

  //Proprietes Classe
    //Genere automatiquement
     private int id ;
     private String libelle;
     private static int nbreClasse;

     //Contructeur
       //Par defaut
    public Classe(){
       nbreClasse++;


      }
    public Classe(String libelle){
      nbreClasse++;
      id=nbreClasse;
      this.libelle=libelle;


    }
    public String getLibelle(){
       return this.libelle;
     }
    public void setLibelle(String libelle){
        this.libelle=libelle;
     }
    public int getId(){
      return this.id;
     }
    public voidI setId(int id){
      this.id=id;
     }
     @override
    public String affiche(){
      return "Id: "+this.id+"Libelle "+this.libelle ;
      
     }
 }