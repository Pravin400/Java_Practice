package _7_oops.polymorphism;

class PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing generic payment of ₹ : "+amount);
    }
}
class CreditCard extends PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing Credit Card Payment of ₹ : "+amount);
        System.out.println("Checking Credit Card Limit .....");
        System.out.println("Authenticating OTP .....");
    }
}

class  UPIPayment extends  PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment of ₹ : "+amount);
        System.out.println("Verifying UPI ID.....");
        System.out.println("Authenticating UPI PIN.....");
    }
}

class NetBanking extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking payment of ₹" + amount);
        System.out.println("Connecting to bank...");
        System.out.println("Authenticating credentials...");
    }
}
public class Demo3PaymentGateWay {
    public static void main(String[] args) {
        PaymentGateway gateway ;
        gateway = new CreditCard();
        gateway.processPayment(55000.00);
        System.out.println("------------------------------------------------------");

        gateway = new UPIPayment();
        gateway.processPayment(65000.00);
        System.out.println("------------------------------------------------------");

        gateway = new NetBanking();
        gateway.processPayment(75000.00);
        System.out.println("------------------------------------------------------");


    }

}
