
import java.util.Random;

public class generator{
    public static void main (String[] args){
        Random random = new Random();// create a random number generator
        String[] orderIds = new String[7];// create an array to hold the order IDs
        for(int i = 0; i < orderIds.length; i++){
            char prefix = (char)(random.nextInt(7) + 'A');
            //generate a random number between 1 and 999 and format it with leading zeros
            int number = random.nextInt(999) + 1;// generate a random number between 1 and 999
            String suffix = String.format("%03d",number);
            orderIds[i] = prefix + suffix; // add the order ID to the array

            for(String orderId : orderIds){
                System.out.println(orderId);
            }

        }
  

    }
}