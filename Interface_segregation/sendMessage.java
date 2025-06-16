public class sendMessage {
    public void send(deliveryMethod method, String message) {
        method.deliver(message);
    }
    
}