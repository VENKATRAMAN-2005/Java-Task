package operators;

public class Student_mark_calculate {
    public static void main(String[] args) {
        int marks = 85;
        int totalMarks = 100;
        double percentage = ((double) marks / totalMarks) * 100;

        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
