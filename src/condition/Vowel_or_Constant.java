package condition;

import java.util.Scanner;

public class Vowel_or_Constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||ch == 'O' || ch == 'U') {	
            System.out.println("The character is Vowel");   
        } else if ((ch >= 'a' && ch <= 'z') ||
                   (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character is Consonant");
        } else {
            System.out.println("Invalid character");
        }
    }
}
