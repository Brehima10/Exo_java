import java.util.Scanner;
public class Calculatrice {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Entrer la valeur du premier nombre");
        int a=sc.nextInt();

        System.out.println("Entrer la valeur du deuxieme nombre");
        int b=sc.nextInt();

        System.out.println("1_Addition");
        System.out.println("2_Soustraction");
        System.out.println("3_Division");
        System.out.println("4_Multiplication");
        System.out.println("5_Modulo");
        System.out.println("6_Quitter");
        System.out.println("aites votre choix !!!");
        char ch=sc.next().charAt(0);

        switch (ch) {
            case '1':
                System.out.println("la somme des nombres est:"+(a+b));
                break;
            case '2':
            System.out.println("la soustraction des nombres est:"+(a-b));
                break;
            case '3':
            System.out.println("la division des nombres est:"+(a/b));
                break;
            case '4':
            System.out.println("la Multiplication des nombres est:"+(a*b));
                break;
            case '5':
            System.out.println("le modulo des nombres est:"+(a%b));
                break;
            case '6':
            System.out.println("Merci à la prochaine fois.");
                break;
        
            default:
                break;
        }





        
    }
}