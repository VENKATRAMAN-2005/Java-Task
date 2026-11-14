package operators;

public class Product_price_calculation {
    public static void main(String[] args) {
        double price = 999.50;
        int quantity = 3;
        double discount = 10;
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;

        totalPrice -= discountAmount;
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + totalPrice);
    }

}
