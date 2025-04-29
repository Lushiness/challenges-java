import java.util.*;
public class whileloop {
    Scanner sc = new Scanner (System.in);


    void decision(){
        String choice;

        System.out.println("Would you like to continue the program: (TYPE Y TO CONTINUE,ANYTHING ELSE TO ABORT) ?");
        choice = sc.next();
        while ("Y".equals(choice)){
            System.out.println("Continuing with the program...");
            choice = sc.next();
        }
    }

    public static void main(String[] args) {
        new whileloop().decision();
    }
}
