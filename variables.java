public class variables {
    void showrate(){
        double price,rate;
        price=8300.00;
        System.out.println("price:" + price);

        rate = 3.0;
        price =price *(100+rate)/100;
        System.out.println("After one year the price will be : " + price);

        price =price *(100+rate)/100;
        System.out.println("After two years the price will be : " + price);

    }

    public static void main(String [] args){
        new variables().showrate();
    }

    
}
