//declaring an array
package exercise1;

public class array {
    public static void main(String[]args){//entry point of any java application
        String[] orderIds = {"B123","C234","A345","D765"};
        for (String item : orderIds){
            if(item.startsWith("B")){
                System.out.println(item);
            }
        }
    }
}
