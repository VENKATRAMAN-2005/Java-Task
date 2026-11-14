package condition;

import java.util.Scanner;

public class LargestTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("First number is largest: " + a);
        } else if (b > a) {
            System.out.println("Second number is largest: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
