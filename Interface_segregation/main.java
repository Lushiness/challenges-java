public class main {
    public static void main(String[] args) {
        deliveryMethod option1 = new gmailApplication();
        deliveryMethod option2 = new teamsApplication();

        sendMessage sender = new sendMessage();


        sender.send(option1,"Hello");
        sender.send(option2,"Hello");
    }
}
