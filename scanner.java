import java.util.Scanner;

public class scanner {
    Scanner scanner = new Scanner (System.in);

    public void readNameandAdm(){
        String name;
        int adm;
        System.out.print("What is your name: ");
        name = scanner.next();

        System.out.print("What is your admission number : ");
        adm = scanner.nextInt();


        System.out.println("hiii " + name + " your admission number is " + adm );

    }
     public static void main(String[] args) {
        new scanner().readNameandAdm();
     }
}
