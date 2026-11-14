package Arrrays;

import java.util.Scanner;

public class Student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[10];
        int highest = 0;
        int lowest = 100;
        int total = 0;
        int pass = 0;
        int fail = 0;
	   System.out.println("Enter 10 student marks:");

    for (int i = 0; i < 10; i++) {
        marks[i] = sc.nextInt();
        total = total + marks[i];
        if (marks[i] > highest) {
            highest = marks[i];
        }
        if (marks[i] < lowest) {
            lowest = marks[i];
        }
        if (marks[i] >= 35) {
            pass++;
        } else {
            fail++;
        }
    }
	System.out.println("\nStudent Marks:");

    for (int i = 0; i < 10; i++) {
        System.out.println("Student " + (i + 1) + ": " + marks[i]);
    }
    double average = total / 10.0;
    System.out.println("\nHighest Mark: " + highest);
    System.out.println("Lowest Mark: " + lowest);
    System.out.println("Total Marks: " + total);
    System.out.println("Average: " + average);
    System.out.println("Passed Students: " + pass);
    System.out.println("Failed Students: " + fail);

    sc.close();
}
}
