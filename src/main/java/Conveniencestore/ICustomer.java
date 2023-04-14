package Conveniencestore;

public interface ICustomer {

    void makePayment(double amount);



     double getWalletBalance();



     void addToCart(Product product, int quantity);


}
