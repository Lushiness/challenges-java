public class budget_price {
    void displayprice(){
        int amount;
        amount = 500;

        if(amount <1000)
        {
            System.out.println("It is affordable!");

        }
        else 
        {
            System.out.println("Try a cheaper alternative");
        }


    }

    public static void main(String [] args){
        new budget_price().displayprice();
    }

    
}
