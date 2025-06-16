public class sendMessage{
    public void send(String type, String message){
        if(type.equals("gmailApplication")){
            System.out.println("Sending message via gmail: "+message);
        }
        else if(type.equals("teamsApplication")){
            System.out.println("Sending message via teams: "+message);
        }
        else{
            System.out.println("Invalid application type");
        }
        
    }
}
