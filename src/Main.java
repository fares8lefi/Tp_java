import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        zooMangment test =new zooMangment();

        System.out.println("entre le nombre : ");
        test.nbrCages = sc.nextInt();
       while(test.nbrCages<0){
           System.out.print("nom : ");
            test.nbrCages = sc.nextInt();
       }
        sc.nextLine();
        System.out.println("entre le nom : ");

        test.zooName=sc.nextLine();
        if(test.zooName.length()==0){
            System.out.println("merci d'entrée le nom: ");
            test.zooName=sc.nextLine();
        }
        test.afficher();

    }
}