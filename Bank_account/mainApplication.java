package Bank_account;

public class mainApplication {
    public static void main(String[] args) {
        admin admin = new admin(1234,"Lucy","beaches");
        user user = new user (5678,"Waithera");
        admin.PerformOperations(new update());
        user.PerformOperations(new view());
    }
    
}
