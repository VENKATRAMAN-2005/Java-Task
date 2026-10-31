package Test1;


	interface Payment {
	    void pay(double amount);
	}


	class UPIPayment implements Payment {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Paid $" + amount + " using UPI reference code.");
	    }
	}

	class CreditCardPayment implements Payment {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Paid $" + amount + " using Credit Card processing gateway.");
	    }
	}


	class CashPayment implements Payment {
	    @Override
	    public void pay(double amount) {
	        System.out.println("Paid $" + amount + " in Cash at the counter.");
	    }
	}
	
	public class Paymen_system {
	    public static void main(String[] args) {
	        Payment paymentGateway;

	        paymentGateway = new UPIPayment();
	        paymentGateway.pay(150.00); 


	        paymentGateway = new CreditCardPayment();
	        paymentGateway.pay(450.50); 

	        paymentGateway = new CashPayment();
	        paymentGateway.pay(20.00); 
	    }
	}

