public class gmailApplication implements deliveryMethod{
    public void deliver(String message){
        System.out.println("Sending message via Gmail: " + message);
    }
    
}
