package com.introductiontojava2;
class CoffeeShop {
    public void menu(){};
    public void coffeeShopAddress(){};
    public void upcomingOffers(){};

}
class Customer extends CoffeeShop{
    int cid;
    String name;
    public Customer(){
        System.out.println("customer created");
    }
    public void pay(){};
    public void orderToken(){};
    public void orderServed(){};
}
class Cashier extends CoffeeShop{
    int cid;
    String name;
    public Cashier(){
        System.out.println("Cashier created");
    }
    public void collectPayment(){};
    public void placeOrder(){};
    public void generatePaymentToken(){};
}
class Barista extends CoffeeShop{
    int cid;
    String name;
    public Barista(){
        System.out.println("Barista created");
    }
    public void getNextOrder(){};
    public void prepareCoffee(){};
    public void orderCompleted(){};
    public void generateOrderToken(){};
}
public class ques10 {
    public static void main(String[] args) {
        Customer cs = new Customer();
        Barista bs = new Barista();
        Cashier cas = new Cashier();
    }
}
