package operators;

interface Student {
    void display();
}
public class Relational_operator {
    public static void main(String[] args) {

        Student s = () -> {

            String name = "Anand";
            int age = 22;
            String department = "Java";

            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Department: " + department);
        };

        s.display();
    }
}

