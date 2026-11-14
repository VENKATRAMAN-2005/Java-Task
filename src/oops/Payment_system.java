package oops;


class Payment {
    void pay() {
        System.out.println("Payment processing");
    }
}
class UPIPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through UPI");
    }
}
class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Card");
    }
}
class CashPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Payment through Cash");
    }
}
public class Payment_system {
   public static void main(String[] args) {
        Payment p;
        p = new UPIPayment();
        p.pay();
        
        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();
    }
}
